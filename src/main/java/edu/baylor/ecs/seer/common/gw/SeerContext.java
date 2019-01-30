package edu.baylor.ecs.seer.common.gw;

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


}
