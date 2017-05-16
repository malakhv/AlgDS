package com.malakhv.algds.list;

/**
 * Created by malakhv on 16.05.17.
 */
public class DoublyLinkedList<E> implements LinkedList<E> {
    @Override
    public boolean add(E element) {
        return false;
    }

    @Override
    public boolean add(E element, int index) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    /**
     * The node of this list.
     * */
    public static class DNode<E> extends Node<E> implements DoublyNode<DNode<E>>  {

        /** The prev node, maybe null. */
        private DNode<E> prev = null;

        /** The next node, maybe null. */
        private DNode<E> next = null;

        @Override
        public DNode<E> getNext() { return next; }

        @Override
        public void setNext(DNode<E> node) { next = node; }

        @Override
        public boolean hasNext() { return next != null; }

        @Override
        public DNode<E> getPrev() { return prev; }

        @Override
        public void setPrev(DNode<E> node) { prev = node; }

        @Override
        public boolean hasPrev() { return prev != null; }
    }
}