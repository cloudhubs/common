package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.Pair;

import java.sql.Timestamp;
import java.util.List;

public class SeerRequestContext {

    /**
     * PATH to local folder
     */
    private String pathToCompiledMicroservices;

    /**
     * Organization name in folder structure
     */
    private String organizationName;

    /**
     * Jar name to identify organization's classes
     */
    private String organizationPath;

    /**
     * IP and PORT
     */
    private List<Pair<String, Integer>> portsToMicroservices;

    /**
     * Local weaver ip and port
     */
    private String localWeaverHttp;

    /**
     * Global weaver: Entity Model Microservice ip and port
     */
    private String gwEntityHttp;

    /**
     * Global weaver: Generator Microservice ip and port
     */
    private String gwGeneratorHttp;

    /**
     * Indicate if using on remote server or on localhost
     */
    private boolean useRemote;

    private Timestamp requestInitiated;

    private String entityAnalyzerInterface;

    private String securityAnalyzerInterface;

    private String productsDirectory;

    public SeerRequestContext() {
    }

    public String getPathToCompiledMicroservices() {
        return pathToCompiledMicroservices;
    }

    public void setPathToCompiledMicroservices(String pathToCompiledMicroservices) {
        this.pathToCompiledMicroservices = pathToCompiledMicroservices;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationPath() {
        return organizationPath;
    }

    public void setOrganizationPath(String organizationPath) {
        this.organizationPath = organizationPath;
    }

    public List<Pair<String, Integer>> getPortsToMicroservices() {
        return portsToMicroservices;
    }

    public void setPortsToMicroservices(List<Pair<String, Integer>> portsToMicroservices) {
        this.portsToMicroservices = portsToMicroservices;
    }

    public boolean isUseRemote() {
        return useRemote;
    }

    public String getEntityAnalyzerInterface() {
        return entityAnalyzerInterface;
    }

    public void setEntityAnalyzerInterface(String entityAnalyzerInterface) {
        this.entityAnalyzerInterface = entityAnalyzerInterface;
    }

    public String getSecurityAnalyzerInterface() {
        return securityAnalyzerInterface;
    }

    public void setSecurityAnalyzerInterface(String securityAnalyzerInterface) {
        this.securityAnalyzerInterface = securityAnalyzerInterface;
    }

    public void setUseRemote(boolean useRemote) {
        this.useRemote = useRemote;
    }

    public Timestamp getRequestInitiated() {
        return requestInitiated;
    }

    public void setRequestInitiated(Timestamp requestInitiated) {
        this.requestInitiated = requestInitiated;
    }

    public String getLocalWeaverHttp() {
        return localWeaverHttp;
    }

    public void setLocalWeaverHttp(String localWeaverHttp) {
        this.localWeaverHttp = localWeaverHttp;
    }

    public String getGwEntityHttp() {
        return gwEntityHttp;
    }

    public void setGwEntityHttp(String gwEntityHttp) {
        this.gwEntityHttp = gwEntityHttp;
    }

    public String getGwGeneratorHttp() {
        return gwGeneratorHttp;
    }

    public void setGwGeneratorHttp(String gwGeneratorHttp) {
        this.gwGeneratorHttp = gwGeneratorHttp;
    }

    public String getProductsDirectory() {
        return productsDirectory;
    }

    public void setProductsDirectory(String productsDirectory) {
        this.productsDirectory = productsDirectory;
    }
}
