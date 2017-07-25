package com.malakhv.algds.tree;

/**
 * Basic interface of node for tree.
 * */
public interface TreeNode<N extends TreeNode> {
    N getChild(int index);
    void setChild(int index, N node);
    int size();
    boolean hasChild();
}
