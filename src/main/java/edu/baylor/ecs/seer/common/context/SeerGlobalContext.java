package edu.baylor.ecs.seer.common.context;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SeerGlobalContext {

  private Integer entityCounter;

  private Integer logicalLinesCounter;

  private Integer configurationLinesCounter;

  private Integer uiLinesCounter;

  private String umlDiagramSource;

  private String umlDiagramResult;

}
