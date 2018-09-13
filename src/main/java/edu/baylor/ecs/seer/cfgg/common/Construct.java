package edu.baylor.ecs.seer.cfgg.common;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Construct {

    private List<Construct> children;
    private List<String> parameters;

    public Construct() {
        this.children = new ArrayList<>();
        this.parameters = new ArrayList<>();
    }

    public final Boolean isLeaf() {
        return this.children.size() == 0;
    }

    public abstract String genDot();

    public abstract String getName();

    public final void addParameter(String parameter) {
        this.parameters.add(parameter);
    }

    public final void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public final List<String> getParameters() {
        return this.parameters;
    }

    public final void addChild(Construct child) {
        this.children.add(child);
    }

    public final void setChildren(List<Construct> children) {
        this.children = children;
    }

    public final List<Construct> getChildren() {
        return this.children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Construct construct = (Construct) o;
        return Objects.equals(children, construct.children) &&
                Objects.equals(parameters, construct.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(children, parameters);
    }

}
