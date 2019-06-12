package edu.baylor.ecs.seer.common.context;

import java.sql.Timestamp;
import java.util.List;

public class SeerResponseContext {
    
    private Integer modulesScanned;
    
    private Timestamp requestCompleted;
    
    private List<String> microservicesNames;
    
    private Integer status;
    
    private String message;

    public SeerResponseContext(){

    }

    public Integer getModulesScanned() {
        return modulesScanned;
    }

    public void setModulesScanned(Integer modulesScanned) {
        this.modulesScanned = modulesScanned;
    }

    public Timestamp getRequestCompleted() {
        return requestCompleted;
    }

    public void setRequestCompleted(Timestamp requestCompleted) {
        this.requestCompleted = requestCompleted;
    }

    public List<String> getMicroservicesNames() {
        return microservicesNames;
    }

    public void setMicroservicesNames(List<String> microservicesNames) {
        this.microservicesNames = microservicesNames;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
