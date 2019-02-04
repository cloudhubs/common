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
    private boolean useIpPort;

    /**
     * 
     */
    private Timestamp requestInitiated;
    
    

}
