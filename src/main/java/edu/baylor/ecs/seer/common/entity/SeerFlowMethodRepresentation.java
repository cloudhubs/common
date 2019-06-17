package edu.baylor.ecs.seer.common.entity;

import edu.baylor.ecs.seer.common.FlowNode;
import edu.baylor.ecs.seer.common.flow.SeerFlowMethod;

import java.util.List;
import java.util.Map;

public class SeerFlowMethodRepresentation {

    private String className;

    private String methodName;

    private List<SeerFlowMethod> children;

    private Map<Integer, FlowNode> nodes;

    private String source;

    private String result;

    public SeerFlowMethodRepresentation() {
    }

    public SeerFlowMethodRepresentation(String className, String methodName, List<SeerFlowMethod> children) {
        this.className = className;
        this.methodName = methodName;
        this.children = children;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public List<SeerFlowMethod> getChildren() {
        return children;
    }

    public void setChildren(List<SeerFlowMethod> children) {
        this.children = children;
    }

    public Map<Integer, FlowNode> getNodes() {
        return nodes;
    }

    public void setNodes(Map<Integer, FlowNode> nodes) {
        this.nodes = nodes;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
