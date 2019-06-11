package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.api.SeerApiMethod;

import java.util.ArrayList;
import java.util.List;

public class SeerApiContext {

    private List<SeerApiMethod> seerApiMethods;

    public SeerApiContext() {

    }

    public List<SeerApiMethod> getSeerApiMethods() {
        return seerApiMethods;
    }

    public void setSeerApiMethods(List<SeerApiMethod> seerApiMethods) {
        this.seerApiMethods = seerApiMethods;
    }

    public void addSeerApiMethod(SeerApiMethod seerApiMethod){
        this.seerApiMethods.add(seerApiMethod);
    }
}
