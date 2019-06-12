package edu.baylor.ecs.seer.common.context;

public class SeerMsContext {

    /**
     * name of the microservice
     */
    private String moduleName;

    /**
     * Microservice IP
     */
    private String ip;

    /**
     * Microservice port
     */
    private Integer port;

    /**
     * Entity Context
     */
    private SeerEntityContext entity;

    /**
     * Security Semantic Context
     */
    private SeerSemanticContext semantic;

    /**
     * Security Syntax Context
     */
    private SeerSyntaxContext syntax;

    /**
     * Seer Flow Context
     */
    private SeerFlowContext flow;

    /**
     * Seer Api Context
     */
    private SeerApiContext api;

    public SeerMsContext() {

    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public SeerEntityContext getEntity() {
        return entity;
    }

    public void setEntity(SeerEntityContext entity) {
        this.entity = entity;
    }

    public SeerSemanticContext getSemantic() {
        return semantic;
    }

    public void setSemantic(SeerSemanticContext semantic) {
        this.semantic = semantic;
    }

    public SeerSyntaxContext getSyntax() {
        return syntax;
    }

    public void setSyntax(SeerSyntaxContext synatx) {
        this.syntax = synatx;
    }

    public SeerFlowContext getFlow() {
        return flow;
    }

    public void setFlow(SeerFlowContext flow) {
        this.flow = flow;
    }

    public SeerApiContext getApi() {
        return api;
    }

    public void setApi(SeerApiContext api) {
        this.api = api;
    }
}
