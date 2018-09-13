package edu.baylor.ecs.seer.cfgg.common;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = ConstructSerializer.class)
@JsonDeserialize(using = ConstructDeserializer.class)
public class Foreach extends Construct {

    private Foreach() {
        super();
    }

    public Foreach(String collection) {
        super();
        this.getParameters().add(collection);
    }

    public String genDot() {
        return "";
    }

    public String getName() {
        return "foreach (item in " + this.getParameters().get(0) + ")";
    }

}
