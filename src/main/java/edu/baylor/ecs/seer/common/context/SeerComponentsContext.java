package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.components.ComponentModel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SeerComponentsContext {
    /*
     * The list of EntityModel objects in the context
     */
    private List<ComponentModel> entities;
    private List<ComponentModel> controllers;
    private List<ComponentModel> services;
    private List<ComponentModel> repositories;
    private List<ComponentModel> components;
}
