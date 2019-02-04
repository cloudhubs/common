package edu.baylor.ecs.seer.common.security;

import java.util.*;

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

    public SecurityMethod(String methodName) {
        this.methodName = methodName;
        childMethods = new HashSet<>();
        methodRoles = new HashSet<>();
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Set<SecurityMethod> getChildMethods() {
        return childMethods;
    }

    public void setChildMethods(Set<SecurityMethod> childMethods) {
        this.childMethods = childMethods;
    }

    public Set<SecurityRole> getMethodRoles() {
        return methodRoles;
    }

    public void setMethodRoles(Set<SecurityRole> methodRoles) {
        this.methodRoles = methodRoles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecurityMethod that = (SecurityMethod) o;
        return Objects.equals(methodName, that.methodName) &&
                Objects.equals(childMethods, that.childMethods) &&
                Objects.equals(methodRoles, that.methodRoles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(methodName, childMethods, methodRoles);
    }

    @Override
    public String toString() {
        return "SecurityMethod{" +
                "methodName='" + methodName + '\'' +
                ", childMethods=" + childMethods +
                ", methodRoles=" + methodRoles +
                '}';
    }

}
