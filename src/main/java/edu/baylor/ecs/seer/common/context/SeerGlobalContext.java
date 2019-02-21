package edu.baylor.ecs.seer.common.context;

public class SeerGlobalContext {

    private Integer entityCounter;

    private Integer logicalLinesCounter;

    private Integer configurationLinesCounter;

    private Integer uiLinesCounter;

    public Integer getEntityCounter() {
        return entityCounter;
    }

    public void setEntityCounter(Integer entityCounter) {
        if (this.entityCounter == null) {
            this.entityCounter = entityCounter;
        } else {
            this.entityCounter += entityCounter;
        }

    }

    public Integer getLogicalLinesCounter() {
        return logicalLinesCounter;
    }

    public void setLogicalLinesCounter(Integer logicalLinesCounter) {
        if (this.logicalLinesCounter == null){
            this.logicalLinesCounter = logicalLinesCounter;
        } else {

        }

    }

    public Integer getConfigurationLinesCounter() {
        return configurationLinesCounter;
    }

    public void setConfigurationLinesCounter(Integer configurationLinesCounter) {
        this.configurationLinesCounter = configurationLinesCounter;
    }

    public Integer getUiLinesCounter() {
        return uiLinesCounter;
    }

    public void setUiLinesCounter(Integer uiLinesCounter) {
        this.uiLinesCounter = uiLinesCounter;
    }
}
