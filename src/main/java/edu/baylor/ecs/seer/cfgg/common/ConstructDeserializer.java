package edu.baylor.ecs.seer.cfgg.common;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConstructDeserializer extends JsonDeserializer<Construct> {

    @Override
    public Construct deserialize(JsonParser parser, DeserializationContext context) throws IOException {

        ObjectCodec codec = parser.getCodec();
        //JsonNode node = codec.readTree(parser);

        while (parser.getCurrentToken() != JsonToken.START_OBJECT) {
            parser.nextToken();
        }
        parser.nextToken();
        String type = parser.getText();
        List<String> params = new ArrayList<>();
        List<Construct> children = new ArrayList<>();

        if (parser.getCurrentToken() == JsonToken.START_ARRAY) {
            while (parser.getCurrentToken() != JsonToken.END_ARRAY) {
                Construct child = new ConstructDeserializer().deserialize(parser, context);
                children.add(child);
                parser.nextToken();
            }
        }

        if (parser.getCurrentToken() == JsonToken.START_ARRAY) {
            while (parser.getCurrentToken() != JsonToken.END_ARRAY) {
                params.add(parser.getText());
                parser.nextToken();
            }
        }

        if (type.equals("If")) {
            If elif = (If) new ConstructDeserializer().deserialize(parser, context);
            return new If(params.get(0), elif);
        } else if (type.equals("For")) {
            return new For(params.get(0), params.get(1), params.get(2));
        } else if (type.equals("Foreach")) {
            return new Foreach(params.get(0));
        } else if (type.equals("While")) {
            return new While(params.get(0));
        } else if (type.equals("Method")) {
            String name = parser.getText();
            parser.nextToken();
            String returnType = parser.getText();
            parser.nextToken();
            return new Method(name, returnType, params);
        }

        while (parser.getCurrentToken() != JsonToken.END_OBJECT) {
            parser.nextToken();
        }

        return null;
    }

    private void advanceToNextValue(JsonParser parser) {
        JsonToken notValues[] = {JsonToken.END_OBJECT, JsonToken.START_OBJECT,
                JsonToken.END_ARRAY, JsonToken.START_ARRAY, JsonToken.FIELD_NAME,
                JsonToken.NOT_AVAILABLE};
    }

}
