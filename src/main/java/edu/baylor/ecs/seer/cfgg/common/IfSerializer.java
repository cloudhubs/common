package edu.baylor.ecs.seer.cfgg.common;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class IfSerializer extends StdSerializer<If> {

    public IfSerializer() {
        this(null);
    }

    public IfSerializer(Class<If> t) {
        super(t);
    }

    @Override
    public void serialize(
            If value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException {

        jgen.writeStartObject();
        jgen.writeFieldName("type");
        jgen.writeString(value.getClass().getSimpleName());
        jgen.writeArrayFieldStart("children");
        for (Construct child : value.getChildren()) {
            if (child == null) {
                jgen.writeFieldName("child");
                jgen.writeNull();
                break;
            }
            jgen.writeObject(child);
        }
        jgen.writeEndArray();
        jgen.writeArrayFieldStart("parameters");
        for (String parameter : value.getParameters()) {
            jgen.writeString(parameter);
        }
        jgen.writeEndArray();
        jgen.writeFieldName("elif");
        jgen.writeObject(value.getElif());
        jgen.writeEndObject();
    }
}
