package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.entity.SeerFlowMethodRepresentation;

import java.util.List;

public class SeerFlowContext {

    private Integer linesOfCode = 0;

    private List<SeerFlowMethodRepresentation> seerFlowMethods;

    public SeerFlowContext() {
    }

    public SeerFlowContext(Integer linesOfCode) {
        this.linesOfCode = linesOfCode;
    }

    public Integer getLinesOfCode() {
        return linesOfCode;
    }

    public void setLinesOfCode(Integer linesOfCode) {
        this.linesOfCode = linesOfCode;
    }

    public List<SeerFlowMethodRepresentation> getSeerFlowMethods() {
        return seerFlowMethods;
    }

    public void setSeerFlowMethods(List<SeerFlowMethodRepresentation> seerFlowMethods) {
        this.seerFlowMethods = seerFlowMethods;
    }
}
