package edu.baylor.ecs.seer.cfgg.flow;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class NodeSerializer extends StdSerializer<Node> {


    protected NodeSerializer(Class<Node> t) {
        super(t);
    }

    @Override
    public void serialize(Node value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        
    }
}
