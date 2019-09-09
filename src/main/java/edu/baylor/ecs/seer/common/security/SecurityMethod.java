package edu.baylor.ecs.seer.common.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SecurityMethod implements Serializable {

    /**
     * Name of the method
     */
    private String methodName;

    /**
     * List of child methods
     */
    private Set<String> childMethods;

    /**
     * List of roles associated with the method
     */
    private Set<String> roles;

    public SecurityMethod(String methodName) {
        this.methodName = methodName;
        childMethods = new HashSet<>();
        roles = new HashSet<>();
    }

}
