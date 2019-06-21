package edu.baylor.ecs.seer.common.security;

public class InvalidSecurityRoleViolation extends SeerSecurityConstraintViolation {

    public InvalidSecurityRoleViolation(SecurityMethod method){
        super("Invalid security role found on method " + method.getMethodName());
        this.method = method;
    }
}