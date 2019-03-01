package edu.baylor.ecs.seer.common.entity;

public class SeerField {

    private String name;

    private String type;

    private String fullType;

    private SeerEntityRelation seerEntityRelation;

    private int min;

    private int max;

    private boolean isNotNull;

    private boolean isUpdatable;

    private String columnName;

    private boolean isId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFullType() {
        return fullType;
    }

    public void setFullType(String fullType) {
        this.fullType = fullType;
    }

    public SeerEntityRelation getSeerEntityRelation() {
        return seerEntityRelation;
    }

    public void setSeerEntityRelation(SeerEntityRelation seerEntityRelation) {
        this.seerEntityRelation = seerEntityRelation;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public boolean isNotNull() {
        return isNotNull;
    }

    public void setNotNull(boolean notNull) {
        isNotNull = notNull;
    }

    public boolean isUpdatable() {
        return isUpdatable;
    }

    public void setUpdatable(boolean updatable) {
        isUpdatable = updatable;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public boolean isId() {
        return isId;
    }

    public void setId(boolean id) {
        isId = id;
    }
}
