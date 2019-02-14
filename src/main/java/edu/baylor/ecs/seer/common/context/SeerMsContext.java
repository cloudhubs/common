package edu.baylor.ecs.seer.common.context;


import javassist.CtClass;

import java.util.List;

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
     * Entity context
     */
    private SeerEntityContext entity;

    /**
     * Security context
     */
    private SeerSemanticContext semantic;

    /**
     * Security context
     */
    private SeerSyntaxContext synatx;

    /**
     * Resource pool of javassist resource clases
     */
    private List<CtClass> ctClassesResourcePool;

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

    public SeerSyntaxContext getSynatx() {
        return synatx;
    }

    public void setSyntax(SeerSyntaxContext synatx) {
        this.synatx = synatx;
    }

    public List<CtClass> getCtClassesResourcePool() {
        return ctClassesResourcePool;
    }

    public void setCtClassesResourcePool(List<CtClass> ctClassesResourcePool) {
        this.ctClassesResourcePool = ctClassesResourcePool;
    }
}
