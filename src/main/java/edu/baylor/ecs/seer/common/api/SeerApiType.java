package edu.baylor.ecs.seer.common.api;

import java.io.Serializable;

/**
 * This enum is a model that represents the direction of an API method. The
 * values of the enum can be either IN or OUT.
 *
 * </p>
 *
 * This object is contained in the {@link edu.baylor.ecs.seer.common.api.SeerApiMethod}
 * object.
 *
 * </p>
 *
 * This object contains no other domain objects.
 *
 * @author  Jan Svacina
 * @version 1.0
 * @since   0.3.0
 *
 */
public enum SeerApiType implements Serializable {
    IN, OUT
}
