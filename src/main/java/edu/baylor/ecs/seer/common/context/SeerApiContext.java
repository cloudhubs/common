package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.api.SeerApiMethod;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SeerApiContext {

    private List<SeerApiMethod> seerApiMethods;

}
