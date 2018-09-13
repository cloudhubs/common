package edu.baylor.ecs.seer.cfgg.flow;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws JsonProcessingException, IOException {
        Node root = new Node("method1", "method");
        root.addChild(new Node("2", "general"), true);
        root.getChildren().get(0).addChild(new Node("var == true", "decision"), true);

        String json = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT).writeValueAsString(root);

        System.out.println(json);

        Node newRoot = new ObjectMapper().readValue(json, Node.class);

        System.out.println(root.equals(newRoot));
        System.out.println(newRoot.equals(root));
    }

}
