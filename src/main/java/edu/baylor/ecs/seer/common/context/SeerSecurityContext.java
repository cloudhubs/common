package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.SeerSecurityNode;
import edu.baylor.ecs.seer.common.security.SecurityMethod;
import edu.baylor.ecs.seer.common.security.SecurityRootMethod;
import edu.baylor.ecs.seer.common.security.SeerSecurityConstraintViolation;
import edu.baylor.ecs.seer.common.security.SeerSecurityEntityAccessViolation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeerSecurityContext implements Serializable {

    /**
     * from User
     * Definition of roles and its hierarchy
     */
    private String securityRoleSpecificationSource;

    private SeerSecurityNode root;

    /**
     * from Security Analyzer
     */
    private Set<SeerSecurityConstraintViolation> roleViolations;
    private Set<SeerSecurityEntityAccessViolation> entityAccessViolations;

    /**
     * from Local Weaver
     */
    private Set<SecurityRootMethod> securityRoots;

    public SeerSecurityContext(String securityRoleSpecificationSource) {
        this.securityRoleSpecificationSource = securityRoleSpecificationSource;
    }

    public SeerSecurityContext(String securityRoleSpecificationSource, SeerSecurityNode root) {
        this.securityRoleSpecificationSource = securityRoleSpecificationSource;
        this.root = root;
    }

}
