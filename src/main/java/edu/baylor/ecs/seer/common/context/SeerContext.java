package edu.baylor.ecs.seer.common.context;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Wraps results from all microservices
 */
@Data
@NoArgsConstructor
public class SeerContext {

    /**
     * Each SeerMsContext represents information about the μservice / module
     */
    private List<SeerMsContext> msContexts;

    /**
     * Request information
     */
    private SeerRequestContext request;

    /**
     * Response information
     */
    private SeerResponseContext response;

    /**
     * Seer Security Context
     */
    private SeerSecurityContext security;

    /**
     * Seer global information
     */
    private SeerGlobalContext global;

    /**
     * Context map of microservice mash
     */
    private SeerEntityContext contextMap;
}
