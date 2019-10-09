package edu.baylor.ecs.seer.common.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SeerField {

  private String name;

  private String type;

  private String fullType;

  private SeerEntityRelation seerEntityRelation;

  private int min;

  private int max;

  private boolean isNotNull;

  private boolean isUpdatable;

  private String columnName;

  private boolean isId;

  private double percentageCandidate;

  private List<SeerField> candidates;

  private boolean isPaired;

}
