package edu.baylor.ecs.seer.common.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class SeerJavaType extends SeerField implements Serializable {
}
