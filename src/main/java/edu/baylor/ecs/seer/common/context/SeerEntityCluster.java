package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.entity.EntityModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * This class is a wrapper for holding all entity objects that are clustered
 * together.
 *
 * </p>
 *
 * This object is not contained within another model object.
 *
 * </p>
 *
 * This object holds instances of {@link EntityModel}.
 *
 * @deprecated
 *
 * @author  Jan Svacina
 * @version 1.0
 * @since   0.3.0
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeerEntityCluster {

    /*
     * The list of EntityModel objects which represents all the objects in the cluster
     */
    private List<EntityModel> entityModels;

}
