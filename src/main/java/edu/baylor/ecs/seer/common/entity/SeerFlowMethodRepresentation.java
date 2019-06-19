package edu.baylor.ecs.seer.common.entity;

import edu.baylor.ecs.seer.common.FlowNode;
import edu.baylor.ecs.seer.common.flow.SeerFlowMethod;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class SeerFlowMethodRepresentation {

    private String className;

    private String methodName;

    private List<SeerFlowMethod> children;

    private Map<Integer, FlowNode> nodes;

    private String source;

    private String result;

}
