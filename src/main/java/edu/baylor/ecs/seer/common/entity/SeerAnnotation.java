package edu.baylor.ecs.seer.common.entity;

import edu.baylor.ecs.seer.common.Pair;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
public class SeerAnnotation implements Serializable {
    private List<Pair> arguments;

}
