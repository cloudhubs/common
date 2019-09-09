package edu.baylor.ecs.seer.common.entity;

import javassist.CtClass;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
public class SeerCtClassWrapper implements Serializable {

    private List<CtClass> entityClasses;

    private List<CtClass> apiInClasses;

    private List<CtClass> apiOutClasses;

    private List<CtClass> serviceClasses;

}
