package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.entity.EntityModel;

import java.util.List;

/**
 * @Author: Jan
 *
 */
public class SeerEntityContext {

    private Integer entityCounter;

    private List<EntityModel> entities;

    private String boundedContextSource;

    private String boundedContextResult;

    public List<EntityModel> getEntities() {
        return entities;
    }

    public void setEntities(List<EntityModel> entities) {
        this.entities = entities;
    }

    public Integer getEntityCounter() {
        return entityCounter;
    }

    public void setEntityCounter(Integer entityCounter) {
        this.entityCounter = entityCounter;
    }

    public String getBoundedContextSource() {
        return boundedContextSource;
    }

    public void setBoundedContextSource(String boundedContextSource) {
        this.boundedContextSource = boundedContextSource;
    }

    public String getBoundedContextResult() {
        return boundedContextResult;
    }

    public void setBoundedContextResult(String boundedContextResult) {
        this.boundedContextResult = boundedContextResult;
    }
}
