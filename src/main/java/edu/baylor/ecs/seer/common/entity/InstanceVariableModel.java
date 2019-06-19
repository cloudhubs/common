package edu.baylor.ecs.seer.common.entity;

import edu.baylor.ecs.seer.common.Pair;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//Todo: Describe this model
@Data
@NoArgsConstructor
public class InstanceVariableModel {

    private String variableName;
    private List<Pair<String, String>> attributes;

    public InstanceVariableModel(String variableName) {
        this.variableName = variableName;
        this.attributes = new ArrayList<>();
    }

}
