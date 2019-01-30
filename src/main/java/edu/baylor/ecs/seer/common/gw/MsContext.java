package edu.baylor.ecs.seer.common.gw;

/**
 * This is a DTO for local weaver results. It is included in HarvesterData to transfer local weaver results.
 */
public class MsContext {

//    /**
//     * This is the id of this result.
//     * //ToDo: We need to figure out how to distinguish particular contexts
//     */
//    private int id;

    /**
     * This is the type of this result. It is an enumerated value.
     */
    //private LocalWeaverResultType type;

    /**
     * @Deprecated
     * This string will contain the JSON data to be parsed.
     */
    //private String data;

    /**
     * This is the id of the module from which this result was returned.
     */
    //private int moduleId;

    /**
     * This is the name of the module from which this result was returned.
     */
    private String moduleName;

    /**
     * Entity context
     */
    private MsEntityContext entityContext;

    /**
     * Security context
     */
    private MsSecurityContext securityContext;



    public MsContext() {
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

//    public LocalWeaverResultType getType() {
//        return type;
//    }
//
//    public void setType(LocalWeaverResultType type) {
//        this.type = type;
//    }
//
//    public String getData() {
//        return data;
//    }
//
//    public void setData(String data) {
//        this.data = data;
//    }
//
//    public int getModuleId() {
//        return moduleId;
//    }
//
//    public void setModuleId(int moduleId) {
//        this.moduleId = moduleId;
//    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

}
