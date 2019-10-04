package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.entity.SeerFlowMethodRepresentation;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SeerFlowContext {

    private Integer linesOfCode = 0;

    private List<SeerFlowMethodRepresentation> seerFlowMethods;

}
