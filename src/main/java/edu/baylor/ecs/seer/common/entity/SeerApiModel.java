package edu.baylor.ecs.seer.common.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
public class SeerApiModel implements Serializable {

    private List<String> arguments;

}
