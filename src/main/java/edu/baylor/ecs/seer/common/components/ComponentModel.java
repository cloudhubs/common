package edu.baylor.ecs.seer.common.components;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.baylor.ecs.seer.common.entity.InstanceVariableModel;
import edu.baylor.ecs.seer.common.entity.SeerField;
import edu.baylor.ecs.seer.common.entity.SeerFlowMethodRepresentation;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Data
@NoArgsConstructor
public class ComponentModel {
  static final AtomicLong NEXT_ID = new AtomicLong(1);
  private final long id = NEXT_ID.getAndIncrement();

  protected String className;
  protected List<ComponentModel> adjEntityModels;
  protected List<InstanceVariableModel> instanceVariables;
  private String classNameShort;
  private List<SeerField> fields;
  private List<SeerFlowMethodRepresentation> methods;
  private double percentageCandidate;
  private boolean merged;
  private boolean visited;
  private ComponentType componentType;

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

  @JsonIgnore
  public String getSimpleClassName() {
    int index = this.className.lastIndexOf('.');
    return (index > 0) ? this.className.substring(index + 1) : this.className;
  }

  public void addInstanceVariableModel(InstanceVariableModel instanceVariableModel) {
    this.instanceVariables.add(instanceVariableModel);
  }

  public void setAdjEntityModel(ComponentModel entityModel) {
    this.adjEntityModels.add(entityModel);
  }

  public String getClassName() {
    return this.className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public String getClassNameShort() {
    return this.classNameShort;
  }

  public void setClassNameShort(String classNameShort) {
    this.classNameShort = classNameShort;
  }

  public java.util.List<edu.baylor.ecs.seer.common.entity.SeerField> getFields() {
    return this.fields;
  }

  public void setFields(java.util.List<edu.baylor.ecs.seer.common.entity.SeerField> fields) {
    this.fields = fields;
  }

  public java.util.List<ComponentModel> getAdjEntityModels() {
    return this.adjEntityModels;
  }

  public void setAdjEntityModels(java.util.List<ComponentModel> adjEntityModels) {
    this.adjEntityModels = adjEntityModels;
  }

  public double getPercentageCandidate() {
    return this.percentageCandidate;
  }

  public void setPercentageCandidate(double percentageCandidate) {
    this.percentageCandidate = percentageCandidate;
  }

  public boolean isMerged() {
    return this.merged;
  }

  public void setMerged(boolean merged) {
    this.merged = merged;
  }

  public boolean isVisited() {
    return this.visited;
  }

  public void setVisited(boolean visited) {
    this.visited = visited;
  }

  public java.util.List<InstanceVariableModel> getInstanceVariables() {
    return this.instanceVariables;
  }

  public void setInstanceVariables(java.util.List<InstanceVariableModel> instanceVariables) {
    this.instanceVariables = instanceVariables;
  }
}
