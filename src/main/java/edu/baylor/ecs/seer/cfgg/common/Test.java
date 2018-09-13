package edu.baylor.ecs.seer.cfgg.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

public class Test{

    public static void main(String[] args) throws JsonProcessingException, IOException {
        Method testMethod = new Method("sampleClass::method1", "void", null);
        testMethod.addChild(new If("cond == true"));
        testMethod.addChild(new Method("sampleClass::method2", "int", null));
        testMethod.addChild(new For("int i = 0", "i < 4", "i++"));

        String json = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT).writeValueAsString(testMethod);

        System.out.println(json);

        Method read = new ObjectMapper().readValue(json, Method.class);

        //System.out.println(testMethod.equals(read));
        //System.out.println(read.equals(testMethod));
    }

}