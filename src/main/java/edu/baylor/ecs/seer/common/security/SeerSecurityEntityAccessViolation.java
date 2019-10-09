package edu.baylor.ecs.seer.common.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeerSecurityEntityAccessViolation {

  ViolationType type;

  SecurityRootMethod methodA;
  SecurityRootMethod methodB;

}
