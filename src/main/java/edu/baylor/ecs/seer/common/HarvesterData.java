package edu.baylor.ecs.seer.common;

import edu.baylor.ecs.seer.common.context.SeerMsContext;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

/**
 * This is a DTO for the Harvester module. It allows other modules to easily obtain the information about local
 * weavers through the Harvester module.
 */
@Data
@NoArgsConstructor
public class HarvesterData {

  /**
   * This is the HTTP status of the request.
   */
  private int status;

  /**
   * This is the HTTP message from the request.
   */
  private String message;

  /**
   * This is a list of all SeerMsContext objects associated with the request.
   */
  private ArrayList<SeerMsContext> data;

}
