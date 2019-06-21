package edu.baylor.ecs.seer.common.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeerSecurityConstraintViolation {
    String message;
    SecurityMethod method;

    public SeerSecurityConstraintViolation(String message){
        this.message = message;
    }
}
