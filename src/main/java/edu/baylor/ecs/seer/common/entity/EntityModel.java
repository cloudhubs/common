package edu.baylor.ecs.seer.common.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class EntityModel {

    private String moduleName;

    private String className;

    private String classNameShort;

    private List<SeerField> fields;

    private List<EntityModel> adjEntityModels;

    private double percentageCandidate;

    private boolean merged;

    private boolean visited;

    private List<InstanceVariableModel> instanceVariables;

    public EntityModel(String className) {
        this.className = className;
        this.setVisited(false);
        this.adjEntityModels = new ArrayList<>();
        this.instanceVariables = new ArrayList<>();
    }

    public EntityModel(String className, List<InstanceVariableModel> instanceVariables) {
        this.className = className;
        this.setVisited(false);
        this.adjEntityModels = new ArrayList<>();
        this.instanceVariables = instanceVariables;
    }

}
