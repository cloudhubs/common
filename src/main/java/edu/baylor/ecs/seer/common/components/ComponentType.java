package edu.baylor.ecs.seer.common.components;

public class ComponentType {

  public enum Type {
    ENTITY,
    CONTROLLER,
    SERVICE,
    REPOSITORY,
    GENERIC_COMPONENT
  }

  public static Type getComponentType(String annotation) {
    switch (annotation) {
      case "javax.persistence.Entity":
      case "javax.persistence.Table":
      case "javax.persistence.MappedSuperclass":
        return Type.ENTITY;
      case "org.springframework.stereotype.Controller":
      case "org.springframework.web.bind.annotation.RequestMapping":
        return Type.CONTROLLER;
      case "org.springframework.stereotype.Service":
        return Type.SERVICE;
      case "org.springframework.stereotype.Repository":
      return Type.REPOSITORY;
      case "org.springframework.boot.autoconfigure.SpringBootApplication":
      case "org.springframework.stereotype.Component":
        return Type.GENERIC_COMPONENT;
    }
    return null;
  }
}
