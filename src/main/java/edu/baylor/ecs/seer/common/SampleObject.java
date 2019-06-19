package edu.baylor.ecs.seer.common;

import edu.baylor.ecs.seer.common.context.SeerRequestContext;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SampleObject {

    /**
     * Request information
     */
    private SeerRequestContext request;

}
