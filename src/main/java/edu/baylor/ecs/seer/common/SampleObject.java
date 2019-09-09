package edu.baylor.ecs.seer.common;

import edu.baylor.ecs.seer.common.context.SeerRequestContext;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class SampleObject implements Serializable {

    /**
     * Request information
     */
    private SeerRequestContext request;

}
