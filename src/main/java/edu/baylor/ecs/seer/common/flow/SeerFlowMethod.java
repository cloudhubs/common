package edu.baylor.ecs.seer.common.flow;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class SeerFlowMethod implements Serializable {

    private String className;

    private String methodName;

}
