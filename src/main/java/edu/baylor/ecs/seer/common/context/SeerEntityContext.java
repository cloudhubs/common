package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.entity.EntityModel;

import java.util.List;

/**
 * @Author: Jan
 *
 */
public class SeerEntityContext {

    private List<EntityModel> entities;

    public List<EntityModel> getEntities() {
        return entities;
    }

    public void setEntities(List<EntityModel> entities) {
        this.entities = entities;
    }
}
