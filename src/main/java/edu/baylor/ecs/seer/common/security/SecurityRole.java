package edu.baylor.ecs.seer.common.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SecurityRole {

    /**
     * Name of the role
     */
    private String roleName;

    public String getFormattedRoleName(){
        if(this.roleName.contains("ROLE_")){
            int startNdx = this.roleName.indexOf("_") + 1;
            return this.roleName.substring(startNdx);
        } else {
            return this.roleName;
        }
    }

}
