package edu.baylor.ecs.seer.cfgg.common;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = ConstructSerializer.class)
@JsonDeserialize(using = ConstructDeserializer.class)
public class While extends Construct {

    private While() {
        super();
    }

    public While(String condition) {
        super();
        this.getParameters().add(condition);
    }

    public String genDot() {
        return "";
    }

    public String getName() {
        return "while (" + this.getParameters().get(0) + ")";
    }

}
