package edu.baylor.ecs.seer.common.security;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@NoArgsConstructor
public class SecurityMethod {

    /**
     * Name of the method
     */
    private String methodName;

    /**
     * List of child methods
     */
    private Set<SecurityMethod> childMethods;

    /**
     * List of roles associated with the method
     */
    private Set<SecurityRole> methodRoles;

}
