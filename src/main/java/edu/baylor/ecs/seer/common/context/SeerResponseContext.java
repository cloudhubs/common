package edu.baylor.ecs.seer.common.context;

import lombok.Data;
import lombok.NoArgsConstructor;

//import java.sql.Timestamp;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
public class SeerResponseContext implements Serializable {
    
    private Integer modulesScanned;
    
//    private Timestamp requestCompleted;
    
    private List<String> microservicesNames;
    
    private Integer status;
    
    private String message;

}
