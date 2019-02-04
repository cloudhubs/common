package edu.baylor.ecs.seer.common.context;


public class SeerMsContext {

    /**
     * name of the microservice
     */
    private String moduleName;

    /**
     * Entity context
     */
    private SeerEntityContext seerEntityContext;

    /**
     * Security context
     */
    private SeerSecurityContext seerSecurityContext;

    private SeerSemanticContext seerSemanticCloneContext;

    private SeerSyntaxContext seerSyntaxCloneContext;

    public SeerMsContext() {
    }




}
