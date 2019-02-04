package edu.baylor.ecs.seer.common.context;

import java.sql.Timestamp;
import java.util.List;

public class SeerResponseContext {
    
    private Integer modulesScanned;
    
    private Timestamp requestCompleted;
    
    private List<String> microservicesNames;
    
    private Integer status;
    
    private String message;
     
}
