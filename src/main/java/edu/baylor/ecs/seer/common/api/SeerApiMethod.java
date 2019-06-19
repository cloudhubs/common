package edu.baylor.ecs.seer.common.api;

import edu.baylor.ecs.seer.common.entity.EntityModel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SeerApiMethod {

    private String className;

    private String methodName;

    private SeerApiType seerApiType;

    private EntityModel entityModel;

}
