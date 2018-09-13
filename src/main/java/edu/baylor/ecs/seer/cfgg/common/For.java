package edu.baylor.ecs.seer.cfgg.common;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = ConstructSerializer.class)
@JsonDeserialize(using = ConstructDeserializer.class)
public class For extends Construct {

    private For() {
        super();
    }

    public For(String decl, String condition, String inc) {
        super();
        this.addParameter(decl);
        this.addParameter(condition);
        this.addParameter(inc);
    }

    public String genDot() {
        return "";
    }

    public String getName() {
        return "for (" + this.getParameters().get(0) + "; "
                + this.getParameters().get(1) + "; "
                + this.getParameters().get(2) + ")";
    }

}
