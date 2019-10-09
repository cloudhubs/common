package edu.baylor.ecs.seer.common.entity;

import edu.baylor.ecs.seer.common.Pair;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SeerAnnotation {
  private List<Pair> arguments;

}
