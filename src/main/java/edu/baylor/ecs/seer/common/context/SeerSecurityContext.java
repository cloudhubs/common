package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.security.SecurityMethod;
import edu.baylor.ecs.seer.common.security.SecurityRole;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: JR
 *
 */
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
    private Map<SecurityMethod, Set<SecurityRole>> roles = new HashMap<>();

    private Map<SecurityMethod, Set<SecurityMethod>> nodes = new HashMap<>();

}
