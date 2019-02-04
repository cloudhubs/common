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
     * IP and PORT
     */
    private List<Pair<String, Integer>> portsToMicroservices;

    /**
     *
     */
    private boolean useRemote;


    private Timestamp requestInitiated;

    public String getPathToCompiledMicroservices() {
        return pathToCompiledMicroservices;
    }

    public void setPathToCompiledMicroservices(String pathToCompiledMicroservices) {
        this.pathToCompiledMicroservices = pathToCompiledMicroservices;
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

    public void setUseRemote(boolean useRemote) {
        this.useRemote = useRemote;
    }

    public Timestamp getRequestInitiated() {
        return requestInitiated;
    }

    public void setRequestInitiated(Timestamp requestInitiated) {
        this.requestInitiated = requestInitiated;
    }
}
