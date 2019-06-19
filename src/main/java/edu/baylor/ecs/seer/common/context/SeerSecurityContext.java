package edu.baylor.ecs.seer.common.context;

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
    private String securityRoleSpecification;

    /**
     * from Security Analyzer
     */
    private List<String> securityViolations;

    /**
     * from Local Weaver
     */
    private Set<SecurityMethod> securityMethods;

    public SeerSecurityContext(String securityRoleSpecification) {
        this.securityRoleSpecification = securityRoleSpecification;
    }

}
