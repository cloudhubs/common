package edu.baylor.ecs.seer.cfgg.common;

public class Foreach extends Construct {

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
