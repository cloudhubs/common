package edu.baylor.ecs.seer.common.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SeerApiModel {

  private List<String> arguments;

}
