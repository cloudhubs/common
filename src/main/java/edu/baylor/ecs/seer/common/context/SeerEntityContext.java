package edu.baylor.ecs.seer.common.context;

import edu.baylor.ecs.seer.common.entity.EntityModel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SeerEntityContext {

    private Integer entityCounter;

    private List<EntityModel> entities;

    private String boundedContextSource;

    private String boundedContextResult;

}
