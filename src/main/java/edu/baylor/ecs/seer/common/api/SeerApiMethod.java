package edu.baylor.ecs.seer.common.api;

import edu.baylor.ecs.seer.common.entity.EntityModel;

import java.util.Objects;

public class SeerApiMethod {

    private String className;

    private String methodName;

    private SeerApiType seerApiType;

    private EntityModel entityModel;

    public SeerApiMethod() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public SeerApiType getSeerApiType() {
        return seerApiType;
    }

    public void setSeerApiType(SeerApiType seerApiType) {
        this.seerApiType = seerApiType;
    }

    public EntityModel getEntityModel() {
        return entityModel;
    }

    public void setEntityModel(EntityModel entityModel) {
        this.entityModel = entityModel;
    }


    @Override
    public String toString() {
        return "SeerApiMethod{" +
                "className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SeerApiMethod)) return false;
        SeerApiMethod that = (SeerApiMethod) o;
        return Objects.equals(getClassName(), that.getClassName()) &&
                Objects.equals(getMethodName(), that.getMethodName()) &&
                getSeerApiType() == that.getSeerApiType() &&
                Objects.equals(getEntityModel(), that.getEntityModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClassName(), getMethodName(), getSeerApiType(), getEntityModel());
    }
}
