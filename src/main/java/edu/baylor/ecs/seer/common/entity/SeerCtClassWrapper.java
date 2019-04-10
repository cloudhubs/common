package edu.baylor.ecs.seer.common.entity;

import javassist.CtClass;

import java.util.ArrayList;
import java.util.List;

public class SeerCtClassWrapper {

    private List<CtClass> entityClasses;

    private List<CtClass> apiInClasses;

    private List<CtClass> apiOutClasses;

    private List<CtClass> serviceClasses;

    public SeerCtClassWrapper(){
        this.entityClasses = new ArrayList<>();
        this.apiInClasses = new ArrayList<>();
        this.apiOutClasses = new ArrayList<>();
        this.serviceClasses = new ArrayList<>();
    }

    public void addApiOutCtClass(CtClass ctClass){
        this.apiOutClasses.add(ctClass);
    }

    public void addEntityClass(CtClass ctClass){
        this.entityClasses.add(ctClass);
    }

    public void addServiceClass(CtClass ctClass){
        this.serviceClasses.add(ctClass);
    }

    public List<CtClass> getEntityClasses() {
        return entityClasses;
    }

    public void setEntityClasses(List<CtClass> entityClasses) {
        this.entityClasses = entityClasses;
    }

    public List<CtClass> getApiInClasses() {
        return apiInClasses;
    }

    public void setApiInClasses(List<CtClass> apiInClasses) {
        this.apiInClasses = apiInClasses;
    }

    public List<CtClass> getApiOutClasses() {
        return apiOutClasses;
    }

    public void setApiOutClasses(List<CtClass> apiOutClasses) {
        this.apiOutClasses = apiOutClasses;
    }

    public List<CtClass> getServiceClasses() {
        return serviceClasses;
    }

    public void setServiceClasses(List<CtClass> serviceClasses) {
        this.serviceClasses = serviceClasses;
    }
}
