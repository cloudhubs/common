package edu.baylor.ecs.seer.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This is a recursive tree-like structure used to store a hierarchy that allows cycles. Each node contains
 * a string defining its data and a list of children that has no bounds on its size. The tree structure allows for a
 * child to have its parent as one of its children.
 */
public class Node {

    /**
     * This is the node's data.
     */
    private String data;
    /**
     * This is the node's children. It may include one or more parents of the child.
     */
    private ArrayList<Node> children;

    public Node(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    /**
     * This will search the tree defined by this node for a node with the given data and return it.
     *
     * @param data This is the data for which to search.
     */
    public Node search(String data) {
        List<Node> visited = new ArrayList<>();
        List<Node> matches = new ArrayList<>();

        // make sure we don't search this node again
        visited.add(this);

        // recursion
        doSearch(data, visited, matches);

        // return null if no match, otherwise return the first node in the list (should be the only one)
        return matches.isEmpty() ? null : matches.get(0);
    }

    /**
     * This is an auxiliary internal search function to prevent the user from being required to pass multiple
     * empty collections. Otherwise, its functionality is nearly identical to {@link Node#search(String)}.
     *
     * @param data The Role for which to search
     * @param visited A list of visited nodes to prevent infinite recursion
     * @param matches A list of matches
     */
    private void searchAux(String data, List<Node> visited, List<Node> matches) {
        if (visited.contains(this)) {
            return;
        }

        visited.add(this);
        doSearch(data, visited, matches);
    }

    /**
     * This will perform the actual check of adding the current node if it matches the data and recursing to
     * all unvisited children.
     *
     * @param data The Role for which to search
     * @param visited A list of all visited nodes to prevent infinite search loops
     * @param matches A list of all current matches
     */
    private void doSearch(String data, List<Node> visited, List<Node> matches) {
        if (this.data.equals(data)) {
            matches.add(this);
        } else if (!this.children.isEmpty()) {
            for ( Node child : this.children ) {
                child.searchAux(data, visited, matches);
            }
        }
    }

    /**
     * This will insert a new node with the given data beneath the node with value
     * given by beneath. It will return true if the insert succeeds and false otherwise.
     *
     * @param data The data to insert
     * @param beneath The node to insert beneath
     * @return true if successful, false otherwise
     */
    public boolean insert(String data, String beneath) {
        Node match = this.search(data);
        if (match != null) {
            Node node = match;
            match = this.search(beneath);
            if (match == null) {
                return false;
            }
            match.children.add(node);
            return true;
        }
        match = this.search(beneath);
        if (match == null) {
            return false;
        }
        match.children.add(new Node(data));

        return true;
    }

    /**
     * This will get the subtree with the given data as its root. If the data is not in the tree,
     * null will be returned.
     *
     * @param data The data whose subtree will be returned
     * @return The data searched for, or null if it is not found
     */
    public Node subTree(String data) {
        return this.search(data);
    }

    /**
     * This will check if the tree contains the given data.
     *
     * @param data The data for which to check
     * @return true if found, false otherwise
     */
    public boolean contains(String data) {
        return this.search(data) != null;
    }

    /**
     * This will check if any of the node's children contain the given data. Similar to {@link Node#contains(String)},
     * but excludes the current node. Notably, if any node in the subtrees of the current node's children contains
     * the current node as a child, this will effectively operate exactly as {@link Node#contains(String)},
     * since the current node will also be checked.
     *
     * @param data The data for which to check
     * @return true if found, false otherwise
     */
    public boolean childContains(String data) {
        for ( Node child : this.children ) {
            if (child.contains(data)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(data, node.data) &&
                Objects.equals(children, node.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, children);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Node:\nRole: ").append(this.data).append("\n");
        for (Node child : this.children) {
            str.append("Child Role: ").append(child.data).append("\n");
        }
        return str.toString();
    }
}
