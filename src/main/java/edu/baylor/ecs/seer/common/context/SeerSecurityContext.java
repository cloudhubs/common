package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.SeerSecurityNode;
import edu.baylor.ecs.seer.common.security.SecurityMethod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeerSecurityContext {

    /**
     * from User
     * Definition of roles and its hierarchy
     */
    private String securityRoleSpecificationSource;

    private SeerSecurityNode root;

    /**
     * from Security Analyzer
     */
    private Set<SecurityMethod> securityViolations;

    /**
     * from Local Weaver
     */
    private Set<SecurityMethod> allSecurityMethods;

    public SeerSecurityContext(String securityRoleSpecificationSource) {
        this.securityRoleSpecificationSource = securityRoleSpecificationSource;
    }

}
