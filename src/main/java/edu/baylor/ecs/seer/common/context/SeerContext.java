package edu.baylor.ecs.seer.common.context;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * This class represents the context of all of the microservices. It holds information
 * relating to the microservices, the initial request metadata, the response metadata,
 * security, the global context, and the global entity context.
 *
 * </p>
 *
 * This object is not contained within another model object.
 *
 * </p>
 *
 * This object holds instances of {@link SeerMsContext},
 * {@link SeerRequestContext}, {@link SeerResponseContext},
 * {@link SeerSecurityContext}, {@link SeerGlobalContext} and
 * {@link SeerEntityContext}
 *
 * @author  Jan Svacina
 * @version 1.0
 * @since   0.3.0
 *
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
    private SeerComponentsContext componentsMap;
}
