package edu.baylor.ecs.seer.common.security;

import java.util.Objects;

public class SecurityRole {

    /**
     * Name of the role
     */
    private String roleName;

    public SecurityRole(){}

    public SecurityRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecurityRole that = (SecurityRole) o;
        return Objects.equals(roleName, that.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleName);
    }

    @Override
    public String toString() {
        return "SecurityRole{" +
                "roleName='" + roleName + '\'' +
                '}';
    }

}
