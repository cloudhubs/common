package edu.baylor.ecs.seer.common.security;

import java.io.Serializable;

public enum ViolationType implements Serializable {
    HIERARCHY, UNRELATED, INVALID_ROLE, ENTITY_ACCESS, UNRESTRICTED_ACCESS
}
