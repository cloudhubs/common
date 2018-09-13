package edu.baylor.ecs.seer.cfgg.common;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;
import java.util.Objects;

@JsonSerialize(using = MethodSerializer.class)
@JsonDeserialize(using = ConstructDeserializer.class)
public class Method extends Construct {

    private String name;
    private String returnType;

    private Method() {
        super();
        this.name = null;
        this.returnType = null;
    }

    public Method(String name, String returnType, List<String> parameters) {
        super();
        this.name = name;
        this.returnType = returnType;
        if (parameters != null) {
            this.setParameters(parameters);
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Method method = (Method) o;
        return Objects.equals(name, method.name) &&
                Objects.equals(returnType, method.returnType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, returnType);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLiteralName() {
        return this.name;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

}
