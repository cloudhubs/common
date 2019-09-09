package edu.baylor.ecs.seer.common.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeerSecurityEntityAccessViolation implements Serializable {

    ViolationType type;

    SecurityRootMethod methodA;
    SecurityRootMethod methodB;

}
