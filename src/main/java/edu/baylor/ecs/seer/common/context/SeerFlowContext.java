package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.flow.SeerFlowMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SeerFlowContext {

    private Integer linesOfCode = 0;

    private Map<SeerFlowMethod, List<SeerFlowMethod>> seerFlowMethods;

    public Map<SeerFlowMethod, List<SeerFlowMethod>> getSeerFlowMethods() {
        return seerFlowMethods;
    }

    public void setSeerFlowMethods(Map<SeerFlowMethod, List<SeerFlowMethod>> seerFlowMethods) {
        this.seerFlowMethods = seerFlowMethods;
    }

    //    public void addSeerFlowMethod(SeerFlowMethod seerFlowMethod){
//        this.seerFlowMethods.add(seerFlowMethod);
//    }


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
