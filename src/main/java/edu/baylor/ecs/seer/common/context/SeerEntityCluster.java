package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.components.ComponentModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeerEntityCluster {

  /*
   * The list of EntityModel objects which represents all the objects in the cluster
   */
  private List<ComponentModel> entityModels;

}
