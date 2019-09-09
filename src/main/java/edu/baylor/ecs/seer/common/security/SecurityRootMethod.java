package edu.baylor.ecs.seer.common.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecurityRootMethod implements Serializable {

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

    /*
     * The type of the method (POST, PUT, etc.)
     */
    private HttpType httpType;

    /*
     * The class definition for the parameter of the API method
     */
    private List<String> parameters;

    private String returnType;

    public SecurityRootMethod(String methodName) {
        this.methodName = methodName;
        childMethods = new HashSet<>();
        roles = new HashSet<>();
        parameters = new ArrayList<>();
    }
}
