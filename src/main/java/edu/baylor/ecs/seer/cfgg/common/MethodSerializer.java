package edu.baylor.ecs.seer.cfgg.common;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class MethodSerializer extends StdSerializer<Method> {

    public MethodSerializer() {
        this(null);
    }

    public MethodSerializer(Class<Method> t) {
        super(t);
    }

    @Override
    public void serialize(
            Method value, JsonGenerator jgen, SerializerProvider provider)
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
        jgen.writeFieldName("name");
        jgen.writeString(value.getLiteralName());
        jgen.writeFieldName("returnType");
        jgen.writeString(value.getReturnType());
        jgen.writeEndObject();
    }
}
