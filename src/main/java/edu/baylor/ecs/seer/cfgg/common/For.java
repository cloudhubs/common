package edu.baylor.ecs.seer.cfgg.common;

public class For extends Construct {

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
