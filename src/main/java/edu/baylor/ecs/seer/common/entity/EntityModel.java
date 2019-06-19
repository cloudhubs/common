package edu.baylor.ecs.seer.common.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

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

}
