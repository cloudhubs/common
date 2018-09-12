package edu.baylor.ecs.seer.cfgg.common;

import java.util.ArrayList;
import java.util.List;

public class If extends Construct {

    private If elif;

    // Note: if condition is null, the if is assumed to be an else
    public If(String condition) {
        super();
        this.addParameter(condition);
        this.elif = null;
    }

    public If(String condition, If elif) {
        super();
        this.addParameter(condition);
        this.elif = elif;
    }

    public String genDot() {
        return "";
    }

    public String getName() {
        return "if (" + this.getParameters().get(0) + ")";
    }

    public List<If> getElifsAsList() {
        if (this.elif == null) {
            return null;
        }

        If next = this.elif;

        List<If> elifs = new ArrayList<>();
        while (next != null) {
            elifs.add(next);
            next = next.getElif();
        }

        return elifs;
    }

    public void setElif(If elif) {
        this.elif = elif;
    }

    public If getElif() {
        return this.elif;
    }

}
