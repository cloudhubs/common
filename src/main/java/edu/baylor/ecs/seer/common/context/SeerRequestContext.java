package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.Pair;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
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
     * Global weaver: Generator Microservice ip and port
     */
    private String gwFlowHttp;

    /**
     * Indicate if using on remote server or on localhost
     */
    private boolean useRemote;

    private Timestamp requestInitiated;

    private String entityAnalyzerInterface;

    private String securityAnalyzerInterface;

    private String productsDirectory;

}
