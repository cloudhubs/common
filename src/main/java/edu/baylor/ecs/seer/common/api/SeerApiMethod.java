package edu.baylor.ecs.seer.common.api;

import edu.baylor.ecs.seer.common.components.ComponentModel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SeerApiMethod {

    /*
     * The name of the class where the API method resides
     */
    private String className;

    /*
     * The name of the method itself
     */
    private String methodName;

    /*
     * The type of the API method - IN or OUT
     */
    private edu.baylor.ecs.seer.common.api.SeerApiType seerApiType;

    /*
     *
     */
    private ComponentModel entityModel;

}
