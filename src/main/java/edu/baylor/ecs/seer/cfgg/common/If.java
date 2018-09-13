package edu.baylor.ecs.seer.cfgg.common;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonSerialize(using = IfSerializer.class)
@JsonDeserialize(using = ConstructDeserializer.class)
public class If extends Construct {

    private If elif;

    private If() {
        super();
        this.elif = null;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        If anIf = (If) o;
        return Objects.equals(elif, anIf.elif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), elif);
    }

}
