package edu.baylor.ecs.seer.common.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeerSecurityConstraintViolation {
    ViolationType type;
    String method;
    Set<String> roles;

    public SeerSecurityConstraintViolation(ViolationType type){
        this.type = type;
        this.roles = new HashSet<>();
    }

    public SeerSecurityConstraintViolation(ViolationType type, SecurityMethod securityMethod){
        this.type = type;
        this.method = securityMethod.getMethodName();
        this.roles = securityMethod.getRoles();
    }

    public SeerSecurityConstraintViolation(ViolationType type, SecurityRootMethod securityRootMethod){
        this.type = type;
        this.method = securityRootMethod.getMethodName();
        this.roles = securityRootMethod.getRoles();
    }
}
