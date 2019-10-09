package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.api.SeerApiMethod;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * This class is a wrapper for holding all {@link SeerApiMethod} objects in
 * a given context. The context for Seer is within a microservice so this object
 * holds all of the API methods for a given microservice.
 *
 * </p>
 * <p>
 * This object is contained in the {@link edu.baylor.ecs.seer.common.context.SeerMsContext}
 * object.
 *
 * </p>
 * <p>
 * This object holds instances of {@link SeerApiMethod}
 *
 * @author Jan Svacina
 * @version 1.0
 * @since 0.3.0
 */
@Data
@NoArgsConstructor
public class SeerApiContext {

  /*
   * A list of all the SeerApiMethods in the microservice
   */
  private List<SeerApiMethod> seerApiMethods;

}
