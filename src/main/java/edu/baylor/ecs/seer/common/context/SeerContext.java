package edu.baylor.ecs.seer.common.context;

import java.util.List;

/**
 * Wraps results from all microservices
 */
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

    public List<SeerMsContext> getMsContexts() {
        return msContexts;
    }

    public void setMsContexts(List<SeerMsContext> msContexts) {
        this.msContexts = msContexts;
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

    public SeerGlobalContext getGlobal() {
        return global;
    }

    public void setGlobal(SeerGlobalContext global) {
        this.global = global;
    }

    public SeerSecurityContext getSecurity() {
        return security;
    }

    public void setSecurity(SeerSecurityContext security) {
        this.security = security;
    }
}
