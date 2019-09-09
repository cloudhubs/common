package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.entity.EntityModel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * This class is a wrapper for holding all entity metadata in
 * a given context. The metadata consists of a count of the entities, the {@link EntityModel}
 * objects representing the entities themselves as well as the "boundedContextSource"
 * which is the raw string for generating the graphs using Graphiz and the "boundedContextResult"
 * which holds the output location of the graph. The context for this class can be
 * either global context or within a given microservice.
 *
 * </p>
 *
 * This object is contained in the {@link edu.baylor.ecs.seer.common.context.SeerMsContext}
 * object and the {@link SeerContext} object.
 *
 * </p>
 *
 * This object holds instances of {@link EntityModel} objects.
 *
 * @author  Jan Svacina
 * @version 1.0
 * @since   0.3.0
 *
 */
@Data
@NoArgsConstructor
public class SeerEntityContext implements Serializable {

    /*
     * The count of al entities in the context
     */
    private Integer entityCounter;

    /*
     * The list of EntityModel objects in the context
     */
    private List<EntityModel> entities;

    /*
     * The raw string to generate the dot graph
     */
    private String boundedContextSource;

    /*
     * The path to the graph .png file on the system
     */
    private String boundedContextResult;

}
