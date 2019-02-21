package edu.baylor.ecs.seer.common.context;

public class SeerFlowContext {

    private Integer linesOfCode = 0;

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
}
