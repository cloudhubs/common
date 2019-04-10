package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.entity.EntityModel;

import java.util.ArrayList;
import java.util.List;

public class SeerEntityCluster {

    private List<EntityModel> entityModels;

    public SeerEntityCluster(){
        this.entityModels = new ArrayList<>();
    }

    public SeerEntityCluster(List<EntityModel> entityModels){
        this.entityModels = entityModels;
    }

    public List<EntityModel> getEntityModels() {
        return entityModels;
    }

    public void setEntityModels(List<EntityModel> entityModels) {
        this.entityModels = entityModels;
    }
}
