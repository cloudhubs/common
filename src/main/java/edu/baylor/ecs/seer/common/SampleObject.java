package edu.baylor.ecs.seer.common;

import edu.baylor.ecs.seer.common.context.SeerRequestContext;

public class SampleObject {

    /**
     * Request information
     */
    private SeerRequestContext request;

    public SampleObject() {
    }

    public SeerRequestContext getRequest() {
        return request;
    }

    public void setRequest(SeerRequestContext request) {
        this.request = request;
    }
}
