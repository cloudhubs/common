package edu.baylor.ecs.seer.common.security;

public class UnrelatedAccessConstraintViolation extends SeerSecurityConstraintViolation {

    public UnrelatedAccessConstraintViolation(SecurityMethod method){
        super("Unrelated access in method " + method.getMethodName());
        this.method = method;
    }
}
