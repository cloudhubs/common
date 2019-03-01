package edu.baylor.ecs.seer.common.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private String className;

    private String classNameShort;

    private List<SeerField> fields;

    private List<InstanceVariableModel> instanceVariables;

    public EntityModel() {
        this.className = "";
        this.instanceVariables = new ArrayList<>();
    }

    public EntityModel(String className) {
        this.className = className;
        this.instanceVariables = new ArrayList<>();
    }

    public EntityModel(String className, List<InstanceVariableModel> instanceVariables) {
        this.className = className;
        this.instanceVariables = instanceVariables;
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
}
