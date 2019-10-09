package edu.baylor.ecs.seer.common;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Pair<F, S> {
  private F first;
  private S second;
}