package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.flow.SeerFlowMethod;

import java.util.List;

public class SeerFlowMethodRepresentation {

    private SeerFlowMethod root;
    private List<SeerFlowMethod> children;

    public SeerFlowMethodRepresentation() {
    }

    public SeerFlowMethodRepresentation(SeerFlowMethod root, List<SeerFlowMethod> children) {
        this.root = root;
        this.children = children;
    }

    public SeerFlowMethod getRoot() {
        return root;
    }

    public void setRoot(SeerFlowMethod root) {
        this.root = root;
    }

    public List<SeerFlowMethod> getChildren() {
        return children;
    }

    public void setChildren(List<SeerFlowMethod> children) {
        this.children = children;
    }
}
