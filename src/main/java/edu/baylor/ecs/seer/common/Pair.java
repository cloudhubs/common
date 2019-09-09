package edu.baylor.ecs.seer.common;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Pair<F, S> implements Serializable {
    private F first;
    private S second;
}