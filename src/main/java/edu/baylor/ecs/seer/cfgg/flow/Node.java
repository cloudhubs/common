package edu.baylor.ecs.seer.cfgg.flow;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
public class Node {

    private String id;
    private String type;
    private List<Node> parents;
    private List<Node> children;
    private Integer height;

    private Node() {
        this.id = null;
        this.type = null;
        this.height = null;
        this.parents = new ArrayList<Node>();
        this.children = new ArrayList<Node>();
    }

    public Node(String id, String type) {
        this.id = id;
        this.type = type;
        this.height = 0;
        this.parents = new ArrayList<Node>();
        this.children = new ArrayList<Node>();
    }

    public Node(String id, String type, Integer height) {
        this.id = id;
        this.type = type;
        this.height = height;
        this.parents = new ArrayList<Node>();
        this.children = new ArrayList<Node>();
    }

    public Node(String id, String type, Integer height, Node parent, Node child) {
        this.id = id;
        this.type = type;
        if (height != null) {
            this.height = height;
        } else if (parent != null) {
            this.height = parent.height + 1;
        } else {
            this.height = null;
        }
        this.parents = new ArrayList<Node>();
        this.children = new ArrayList<Node>();
        if (parent != null) {
            this.addParent(parent);
        }
        if (child != null) {
            this.addChild(child, true);
        }
    }

    public Node(String id, String type, Integer height, List<Node> parents, List<Node> children) {
        this.id = id;
        this.type = type;
        if (height != null) {
            this.height = height;
        } else if (height == null && parents != null) {
            if (parents.size() == 0) {
                this.height = null;
            }
            this.height = parents.get(0).height + 1;
        } else {
            this.height = null;
        }
        if (parents != null) {
            for (Node parent : parents) {
                this.addParent(parent);
            }
        } else {
            this.parents = new ArrayList<Node>();
        }
        if (children != null) {
            for (Node child : children) {
                this.addChild(child, true);
            }
        } else {
            this.children = new ArrayList<Node>();
        }
    }

    /**
     * Adds a child to the node's list of children. Also updates the parents
     * list on the added child. Returns the modified node for chaining.
     * Updates height of child if updateHeight is true.
     *
     * @param child
     * @param updateHeight
     * @return the modified node
     */
    public Node addChild(Node child, Boolean updateHeight) {
        this.children.add(child);
        child.parents.add(this);

        if (updateHeight) {
            child.height = this.height + 1;
        }

        return this;
    }

    /**
     * Adds a parent to the node's list of parents. Also updates the children
     * list on the added parent. Returns the modified node for chaining.
     *
     * @param parent
     * @return the modified node
     */
    public Node addParent(Node parent) {
        this.parents.add(parent);
        parent.children.add(this);
        return this;
    }

    /**
     * Removes a child from the node's list of children. Also updates the
     * parents list on the removed child. Returns whether a child was removed.
     *
     * @param child
     * @return whether a child was removed
     */
    public Boolean removeChild(Node child) {
        child.parents.remove(this);
        return this.children.remove(child);
    }

    /**
     * Removes a parent from the node's list of parents. Also updates the
     * children list on the removed parent. Returns whether a parent was
     * removed.
     *
     * @param parent
     * @return whether a parent was removed
     */
    public Boolean removeParent(Node parent) {
        parent.children.remove(this);
        return this.parents.remove(parent);
    }

    /**
     * Deletes this node, connecting all of its parents to its children, then
     * returns false. If the node is a root, instead deletes the entire tree
     * and then returns true.
     *
     * @return true if deleted root, false else
     */
    public Boolean delete() {
        if (this.height == 0) {
            for (Node child : this.children) {
                child.setParents(new ArrayList<Node>());
                child.delete();
            }
            this.children = new ArrayList<Node>();
            return true;
        }

        for (Node child : this.children) {
            child.removeParent(this);
            for (Node parent : this.parents) {
                parent.removeChild(this);
                child.addParent(parent);
            }
        }
        return false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Node> getParents() {
        return parents;
    }

    public void setParents(List<Node> parents) {
        this.parents = parents;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public Integer getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(id, node.id) &&
                Objects.equals(type, node.type) &&
                Objects.equals(parents, node.parents) &&
                Objects.equals(children, node.children) &&
                Objects.equals(height, node.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, parents, children, height);
    }

}
