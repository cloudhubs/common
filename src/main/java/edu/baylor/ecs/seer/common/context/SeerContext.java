package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.entity.EntityModel;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

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

    /**
     * Context map of microservice mash
     */
    private SeerEntityContext contextMap;

    private EntityModel contextMapEntities;

    private List<SeerEntityCluster> entityClusters;

    public SeerContext() {
    }

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

    public SeerEntityContext getContextMap() {
        return contextMap;
    }

    public void setContextMap(SeerEntityContext contextMap) {
        this.contextMap = contextMap;
    }

    public EntityModel getContextMapEntities() {
        return contextMapEntities;
    }

    public void setContextMapEntities(EntityModel contextMapEntities) {
        this.contextMapEntities = contextMapEntities;
    }

    public List<SeerEntityCluster> getEntityClusters() {
        return entityClusters;
    }

    public void setEntityClusters(List<SeerEntityCluster> entityClusters) {
        this.entityClusters = entityClusters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SeerContext)) return false;
        SeerContext that = (SeerContext) o;
        return Objects.equals(getMsContexts(), that.getMsContexts()) &&
                Objects.equals(getRequest(), that.getRequest()) &&
                Objects.equals(getResponse(), that.getResponse()) &&
                Objects.equals(getSecurity(), that.getSecurity()) &&
                Objects.equals(getGlobal(), that.getGlobal()) &&
                Objects.equals(getContextMap(), that.getContextMap()) &&
                Objects.equals(getContextMapEntities(), that.getContextMapEntities()) &&
                Objects.equals(getEntityClusters(), that.getEntityClusters());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMsContexts(), getRequest(), getResponse(), getSecurity(), getGlobal(), getContextMap(), getContextMapEntities(), getEntityClusters());
    }
}
