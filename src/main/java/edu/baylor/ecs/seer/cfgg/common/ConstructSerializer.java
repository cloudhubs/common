package edu.baylor.ecs.seer.cfgg.common;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class ConstructSerializer extends StdSerializer<Construct> {

    public ConstructSerializer() {
        this(null);
    }

    public ConstructSerializer(Class<Construct> t) {
        super(t);
    }

    @Override
    public void serialize(
            Construct value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException {

        jgen.writeStartObject();
        jgen.writeFieldName("type");
        jgen.writeString(value.getClass().getSimpleName());
        jgen.writeArrayFieldStart("children");
        for (Construct child : value.getChildren()) {
            jgen.writeObject(child);
        }
        jgen.writeEndArray();
        jgen.writeArrayFieldStart("parameters");
        for (String parameter : value.getParameters()) {
            jgen.writeString(parameter);
        }
        jgen.writeEndArray();
        jgen.writeEndObject();
    }
}
