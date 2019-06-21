package edu.baylor.ecs.seer.common.security;

public class HierarchyConstraintViolation extends SeerSecurityConstraintViolation {

    public HierarchyConstraintViolation(SecurityMethod method){
        super("Hierarchy violated by " + method.getMethodName());
        this.method = method;
    }
}
