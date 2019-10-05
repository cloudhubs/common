package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.components.ComponentModel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
public class SeerEntityContext {

    /*
     * The count of al entities in the context
     */
    private Integer entityCounter;

    /*
     * The list of EntityModel objects in the context
     */
    private List<ComponentModel> entities;

    /*
     * The raw string to generate the dot graph
     */
    private String boundedContextSource;

    /*
     * The path to the graph .png file on the system
     */
    private String boundedContextResult;

}
