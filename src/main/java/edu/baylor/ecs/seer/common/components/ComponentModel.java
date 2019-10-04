package edu.baylor.ecs.seer.common.components;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.baylor.ecs.seer.common.entity.InstanceVariableModel;
import edu.baylor.ecs.seer.common.entity.SeerField;
import edu.baylor.ecs.seer.common.entity.SeerFlowMethodRepresentation;
import edu.baylor.ecs.seer.common.flow.SeerFlowMethod;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class ComponentModel {
  protected String className;
  protected List<ComponentModel> adjEntityModels;
  protected List<InstanceVariableModel> instanceVariables;
  private String classNameShort;
  private List<SeerField> fields;
  private List<SeerFlowMethodRepresentation> methods;
  private double percentageCandidate;
  private boolean merged;
  private boolean visited;

  @JsonIgnore
  public String getSimpleClassName(){
      int index = this.className.lastIndexOf('.');
      return (index > 0) ? this.className.substring(index + 1) : this.className;
  }

  public ComponentModel(String className) {
    this.className = className;
    this.setVisited(false);
    this.adjEntityModels = new ArrayList<>();
    this.instanceVariables = new ArrayList<>();
  }

  public ComponentModel(String className, List<InstanceVariableModel> instanceVariables) {
    this.className = className;
    this.setVisited(false);
    this.adjEntityModels = new ArrayList<>();
    this.instanceVariables = instanceVariables;
  }
  public void addInstanceVariableModel(InstanceVariableModel instanceVariableModel){
      this.instanceVariables.add(instanceVariableModel);
  }

  public void setAdjEntityModel(ComponentModel entityModel){
      this.adjEntityModels.add(entityModel);
  }

  public String getClassName() {
    return this.className;
  }

  public String getClassNameShort() {
    return this.classNameShort;
  }

  public java.util.List<edu.baylor.ecs.seer.common.entity.SeerField> getFields() {
    return this.fields;
  }

  public java.util.List<ComponentModel> getAdjEntityModels() {
    return this.adjEntityModels;
  }

  public double getPercentageCandidate() {
    return this.percentageCandidate;
  }

  public boolean isMerged() {
    return this.merged;
  }

  public boolean isVisited() {
    return this.visited;
  }

  public java.util.List<InstanceVariableModel> getInstanceVariables() {
    return this.instanceVariables;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public void setClassNameShort(String classNameShort) {
    this.classNameShort = classNameShort;
  }

  public void setFields(java.util.List<edu.baylor.ecs.seer.common.entity.SeerField> fields) {
    this.fields = fields;
  }

  public void setAdjEntityModels(java.util.List<ComponentModel> adjEntityModels) {
    this.adjEntityModels = adjEntityModels;
  }

  public void setPercentageCandidate(double percentageCandidate) {
    this.percentageCandidate = percentageCandidate;
  }

  public void setMerged(boolean merged) {
    this.merged = merged;
  }

  public void setVisited(boolean visited) {
    this.visited = visited;
  }

  public void setInstanceVariables(java.util.List<InstanceVariableModel> instanceVariables) {
    this.instanceVariables = instanceVariables;
  }

  public String toString() {
    return "EntityModel(className=" + this.getClassName() + ", classNameShort=" + this.getClassNameShort() + ", fields=" + this.getFields() + ", adjEntityModels=" + this.getAdjEntityModels() + ", percentageCandidate=" + this.getPercentageCandidate() + ", merged=" + this.isMerged() + ", visited=" + this.isVisited() + ", instanceVariables=" + this.getInstanceVariables() + ")";
  }
}
