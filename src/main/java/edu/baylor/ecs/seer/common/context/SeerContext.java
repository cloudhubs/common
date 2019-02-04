package edu.baylor.ecs.seer.common.context;

import java.util.List;

/**
 * Wraps results from all microservices
 */
public class SeerContext {

    /**
     * This is the HTTP status of the request.
     */
    private int status;

    /**
     * This is the HTTP message from the request.
     */
    private String message;

    /**
     * Each MsContext represents information about the μservice / module
     */
    private List<MsContext> msContextList;

    private SeerRequestContext seerRequestSpecification;

    private SeerResponseContext seerResponseSpecification;

    private SeerSecurityContext seerSecurityContext;

    private SeerEntityContext seerEntityContext;

    private SeerSemanticContext seerSemanticCloneContext;

    private SeerSyntaxContext seerSyntaxCloneContext;



}
