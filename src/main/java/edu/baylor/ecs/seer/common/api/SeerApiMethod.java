package edu.baylor.ecs.seer.common.api;

import edu.baylor.ecs.seer.common.entity.EntityModel;

public class SeerApiMethod {

    private String className;

    private String methodName;

    private SeerApiType seerApiType;

    private EntityModel entityModel;

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
}
