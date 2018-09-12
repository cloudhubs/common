package edu.baylor.ecs.seer.cfgg.common;

public class While extends Construct {

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
