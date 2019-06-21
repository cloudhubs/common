package edu.baylor.ecs.seer.common.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecurityRootMethod {

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

    /*
     * The type of the method (POST, PUT, etc.)
     */
    private HttpType httpType;

    /*
     * The class definition for the parameter of the API method
     */
    private String parameterType;

    public SecurityRootMethod(String methodName) {
        this.methodName = methodName;
        childMethods = new HashSet<>();
        methodRoles = new HashSet<>();
    }
}
