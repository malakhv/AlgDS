package com.malakhv.algds.tree;

import com.malakhv.algds.data.Node;

/**
 * Created by malakhv on 16.05.17.
 */
public class BinaryTree<E> implements Tree<E> {

    private BNode<E> root = null;

    @Override
    public boolean add(E element) {
        if (root == null) {
            BNode<E> node = new BNode<>();
            node.set(element);
            root = node;
            return true;
        } else {
            return add(element, root);
        }
    }

    private boolean add(E element, BNode<E> parent) {
        if (parent == null || parent.isFull()) return false;
        final BNode<E> node = new BNode<>();
        node.set(element);
        if (parent.left == null) parent.left = node;
        else parent.right = node;
        node.parent = parent;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void clear() {
        root = null;
    }

    @Override
    public int size() {
        return 0;
    }

    public static class BNode<E> extends Node<E> implements TreeNode<BNode<E>> {
        private BNode<E> parent = null;
        private BNode<E> left = null;
        private BNode<E> right = null;

        @Override
        public BNode<E> getChild(int index) {
            return null;
        }

        @Override
        public void setChild(int index, BNode<E> node) {
            if (index == 0) left = node;
            else if (index == 1) right = node;
        }

        @Override
        public int size() {
            return 2;
        }

        @Override
        public boolean hasChild() { return left != null || right != null; }

        public boolean isFull() { return left != null && right != null; }
    }
}