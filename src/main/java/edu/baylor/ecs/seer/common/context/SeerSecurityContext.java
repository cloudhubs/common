package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.security.SecurityMethod;
import edu.baylor.ecs.seer.common.security.SecurityRole;

import java.util.*;

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
    private Set<SecurityMethod> securityMethods;

    public SeerSecurityContext(String securityRoleSpecification) {
        this.securityRoleSpecification = securityRoleSpecification;
    }

    public String getSecurityRoleSpecification() {
        return securityRoleSpecification;
    }

    public void setSecurityRoleSpecification(String securityRoleSpecification) {
        this.securityRoleSpecification = securityRoleSpecification;
    }

    public List<String> getSecurityViolations() {
        return securityViolations;
    }

    public void setSecurityViolations(List<String> securityViolations) {
        this.securityViolations = securityViolations;
    }

    public Set<SecurityMethod> getSecurityMethods() {
        return securityMethods;
    }

    public void setSecurityMethods(Set<SecurityMethod> securityMethods) {
        this.securityMethods = securityMethods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeerSecurityContext that = (SeerSecurityContext) o;
        return Objects.equals(securityRoleSpecification, that.securityRoleSpecification) &&
                Objects.equals(securityViolations, that.securityViolations) &&
                Objects.equals(securityMethods, that.securityMethods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityRoleSpecification, securityViolations, securityMethods);
    }

    @Override
    public String toString() {
        return "SeerSecurityContext{" +
                "securityRoleSpecification='" + securityRoleSpecification + '\'' +
                ", securityViolations=" + securityViolations +
                ", securityMethods=" + securityMethods +
                '}';
    }

}
