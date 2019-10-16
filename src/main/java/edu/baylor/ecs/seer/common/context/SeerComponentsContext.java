package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.components.ComponentModel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
public class SeerComponentsContext implements Serializable {
  private static final long serialVersionUID = - 8414552723372946272L;
  private Set<ComponentModel> entities;
  private Set<ComponentModel> controllers;
  private Set<ComponentModel> services;
  private Set<ComponentModel> repositories;
  private Set<ComponentModel> components;
  private Set<ComponentModel> others;
}
