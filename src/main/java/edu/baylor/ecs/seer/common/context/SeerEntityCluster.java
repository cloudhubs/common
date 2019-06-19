package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.entity.EntityModel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SeerEntityCluster {

    private List<EntityModel> entityModels;

}
