package edu.baylor.ecs.seer.cfgg.common;

import java.util.List;

public class Method extends Construct {

    private String name;
    private String returnType;

    public Method(String name, String returnType, List<String> parameters) {
        super();
        this.name = name;
        this.returnType = returnType;
        this.setParameters(parameters);
    }

    public String genDot() {
        return "";
    }

    public String getName() {
        String val = this.returnType + " " + this.name + "(";
        for (String parameter : this.getParameters()) {
            val += parameter;
            if (this.getParameters().indexOf(parameter) != this.getParameters().size() - 1) {
                val += ", ";
            }
        }
        val += ")";
        return val;
    }

}
