package edu.baylor.ecs.seer.common.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.baylor.ecs.seer.common.api.SeerApiMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Class name
 * List of fields
 *  list of annotations
 *      each annotation: name, attribute - list of values
 *      @NotNull, @OneToOne
 *
 */

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

    public EntityModel() {

    }

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

    public void init(){
        this.className = "";
        this.adjEntityModels = new ArrayList<>();
        this.setVisited(false);
        this.instanceVariables = new ArrayList<>();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassNameShort() {
        return classNameShort;
    }

    public void setClassNameShort(String classNameShort) {
        this.classNameShort = classNameShort;
    }

    public List<InstanceVariableModel> getInstanceVariables() {
        return instanceVariables;
    }

    public void setInstanceVariables(List<InstanceVariableModel> instanceVariables) {
        this.instanceVariables = instanceVariables;
    }

    public double getPercentageCandidate() {
        return percentageCandidate;
    }

    public void setPercentageCandidate(double percentageCandidate) {
        this.percentageCandidate = percentageCandidate;
    }

    @JsonIgnore
    public String getSimpleClassName(){
        int index = this.className.lastIndexOf('.');
        return (index > 0) ? this.className.substring(index + 1) : this.className;
    }

    public void addInstanceVariableModel(InstanceVariableModel instanceVariableModel){
        this.instanceVariables.add(instanceVariableModel);
    }

    public List<SeerField> getFields() {
        return fields;
    }

    public void setFields(List<SeerField> fields) {
        this.fields = fields;
    }


    public boolean isMerged() {
        return merged;
    }

    public void setMerged(boolean merged) {
        this.merged = merged;
    }

    public List<EntityModel> getAdjEntityModels() {
        return adjEntityModels;
    }

    public void setAdjEntityModels(List<EntityModel> adjEntityModels) {
        this.adjEntityModels = adjEntityModels;
    }

    public void setAdjEntityModel(EntityModel entityModel){
        this.adjEntityModels.add(entityModel);
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
