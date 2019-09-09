package edu.baylor.ecs.seer.common;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The node class defines the graph structure for modelling java program flow
 * in seer-cfgg. It is similar to a tree structure; however, it does allow
 * back-edges which will produce cycles -- this is necessary to properly track
 * program flow and allow loop detection.
 *
 * Each node has 5 attributes -- id, type, parents, children, and height. A
 * node's id is its identifier, and the form will vary based on type. For a
 * general type node, the id will likely be a reference to a bytecode
 * instruction number, or some other generally meaningless value. For a
 * decision type node, the id will be the decision condition. For a method
 * type node, the id will be the method name (possibly in truncated form).
 *
 * A node's type can be general, decision, or method. These types are used
 * to track different concerns in the flow graph. General type nodes are
 * simply stopping points along the flow, and will not contain any more
 * interesting information. Decision type nodes will always have more than
 * one child, as they mark a divergence in program flow paths. These nodes
 * will allow us to identify loops and if statements later on. Finally, method
 * type nodes can each be treated as the root of their own tree, as they will
 * each have their own flow graph. Additionally, the root of any given Node
 * tree should be a method node.
 *
 * Each node tracks both its parents and its children for ease of traversal.
 * Height is used to determine back-edges, and is not updated once set.
 */
@Getter
@Setter
public class FlowNode implements Serializable {

    // Data Fields
    private Integer id;
    private String type;
    private String raw;

    // Connector Fields
    private List<Integer> parents;
    private List<Integer> children;

    private FlowNode() {
        this.id = null;
        this.type = null;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.raw = "";
    }

    public FlowNode(String id, String type) {
        this.id = Integer.valueOf(id);
        this.type = type;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.raw = "";
    }

    /**
     * Adds a child to the node's list of children. Also updates the parents
     * list on the added child. Returns the modified node for chaining.
     * Updates height of child if updateHeight is true.
     *
     * @param child
     * @return the modified node
     */
    public FlowNode addChild(FlowNode child) {
        if(this.children == null){
            this.children = new ArrayList<>();
        }
        this.children.add(child.id);
        child.parents.add(this.id);

        return this;
    }

    /**
     * Adds a parent to the node's list of parents. Also updates the children
     * list on the added parent. Returns the modified node for chaining.
     *
     * @param parent the parent to be added
     * @return the modified node
     */
    public FlowNode addParent(FlowNode parent) {
        if(this.parents == null){
            this.children = new ArrayList<>();
        }
        this.parents.add(parent.id);
        parent.children.add(this.id);
        return this;
    }

    /**
     * Removes a child from the node's list of children. Also updates the
     * parents list on the removed child. Returns whether a child was removed.
     *
     * @param child the child to be added
     * @return whether a child was removed
     */
    public Boolean removeChild(FlowNode child) {
        child.parents.remove(this.id);
        return this.children.remove(child.id);
    }

    /**
     * Removes a parent from the node's list of parents. Also updates the
     * children list on the removed parent. Returns whether a parent was
     * removed.
     *
     * @param parent the parent to be removed
     * @return whether a parent was removed
     */
    public Boolean removeParent(FlowNode parent) {
        parent.children.remove(this.id);
        return this.parents.remove(parent.id);
    }

}
