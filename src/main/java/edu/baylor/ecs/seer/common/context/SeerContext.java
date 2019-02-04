package edu.baylor.ecs.seer.common.context;

import java.util.List;

/**
 * Wraps results from all microservices
 */
public class SeerContext {


    /**
     * Each SeerMsContext represents information about the μservice / module
     */
    private List<SeerMsContext> msContext;

    /**
     * Request information
     */
    private SeerRequestContext request;

    /**
     * Response information
     */
    private SeerResponseContext response;

    public List<SeerMsContext> getMsContext() {
        return msContext;
    }

    public void setMsContext(List<SeerMsContext> msContext) {
        this.msContext = msContext;
    }

    public SeerRequestContext getRequest() {
        return request;
    }

    public void setRequest(SeerRequestContext request) {
        this.request = request;
    }

    public SeerResponseContext getResponse() {
        return response;
    }

    public void setResponse(SeerResponseContext response) {
        this.response = response;
    }
}
