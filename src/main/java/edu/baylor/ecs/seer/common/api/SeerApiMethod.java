package edu.baylor.ecs.seer.common.api;

import edu.baylor.ecs.seer.common.entity.EntityModel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * This class is a model for representing an API method. This model keeps
 * track of the method's class and signature, the {@link SeerApiType} of the
 * method which can be either IN or OUT and an {@link EntityModel} which
 * represents the parameter/return data.
 *
 * </p>
 *
 * This object is contained in the {@link edu.baylor.ecs.seer.common.context.SeerApiContext}
 * object.
 *
 * </p>
 *
 * This object contains instances of {@link SeerApiType} and {@link EntityModel}
 *
 * @author  Jan Svacina
 * @version 1.0
 * @since   0.3.0
 *
 */
@Data
@NoArgsConstructor
public class SeerApiMethod implements Serializable {

    /*
     * The name of the class where the API method resides
     */
    private String className;

    /*
     * The name of the method itself
     */
    private String methodName;

    /*
     * The type of the API method - IN or OUT
     */
    private SeerApiType seerApiType;

    /*
     *
     */
    private EntityModel entityModel;

}
