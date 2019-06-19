package edu.baylor.ecs.seer.common.context;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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

}
