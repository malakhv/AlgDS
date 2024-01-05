/* *
 * Copyright (C) 1996-2012 Mikhail Malakhov <malakhv@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied.
 *
 * See the License for the specific language governing permissions
 * and limitations under the License.
 * */

package me.mikhan.algds.list;

import me.mikhan.algds.data.Node;

/**
 * The singly linked list.
 *
 * @author Mikhail.Malakhov
 * */
public class SinglyLinkedList<E> implements List<E> {

    /** The first node. */
    private SNode<E> first = null;

    /** {@inheritDoc} */
    @Override
    public boolean add(E element) {
        SNode<E> last = getLast();
        SNode<E> node = new SNode<>();
        node.set(element);
        if (last != null) last.next = node;
        else first = node;
        return true;
    }

    /** {@inheritDoc} */
    @Override
    public boolean add(E element, int index) {
        SNode<E> node = first;
        SNode<E> newNode = new SNode<>();
        newNode.set(element);
        if (index == 0) { // For first element
            newNode.next = first;
            first = newNode;
        }
        while (node != null && index > 0) {
            if (index == 1) { // We need to insert element in next position
                newNode.next = node.next;
                node.next = newNode;
                return true;
            }
            index--;
            node = node.next;
        }
        return false;
    }

    /** {@inheritDoc} */
    @Override
    public E get(int index) {
        SNode<E> node = node(index);
        if (node != null) return node.get();
        else return null;
    }

    /**
     * @return The last node in this list, or null.
     * */
    private SNode<E> getLast() {
        SNode<E> node = first;
        while (node != null) {
            if (!node.hasNext()) break;
            node = node.getNext();
        }
        return node;
    }

    /**
     * @return The node from this list by index, or null.
     * */
    private SNode<E> node(int index) {
        if (isEmpty()) return null;
        SNode<E> node = first;
        while (node != null && index > 0) {
            node = node.getNext();
            index--;
        }
        return index <= 0 ? node : null;
    }

    /** {@inheritDoc} */
    @Override
    public boolean remove(int index) {

        // If list is empty, do nothing.
        if (isEmpty()) return false;

        // If need to remove first element, just change first
        if (index == 0) {
            first = first.next; return true;
        }

        // Find element with specified index and remove it
        SNode<E> node = first;
        while (node != null) {
            if (index == 1) { // We need to remove next element
                if (node.next != null) {
                    node.next = node.next.next;
                    return true;
                }
            }
            node = node.getNext();
            index--;
        }
        return false;
    }

    /** {@inheritDoc} */
    @Override
    public void reverse() {
        if (isEmpty()) return;
        SNode<E> node = first.next;
        SNode<E> next;
        first.next = null;
        while (node != null) {
            next = node.next;
            node.next = first;
            first = node;
            node = next;
        }
    }

    /**
     * Reverses the order of the elements in the specified list.
     * */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void reverse(SinglyLinkedList<?> list) {
        if (list == null || list.isEmpty()) return;
        SNode node = list.first.next;
        SNode next;
        list.first.next = null;
        while (node != null) {
            next = node.getNext();
            node.setNext(list.first);
            list.first = node;
            node = next;
        }
    }

    /** {@inheritDoc} */
    @Override
    public boolean isEmpty() {
        return first == null;
    }

    /** {@inheritDoc} */
    @Override
    public int size() {
        SNode<E> node = first;
        int size = 0;
        while (node != null) {
            size++;
            node = node.getNext();
        }
        return size;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        if (isEmpty()) return "{}";
        SNode<E> node = first;
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        while (node != null) {
            builder.append(node.get()).append(",");
            node = node.getNext();
        }
        // Remove last ","
        int len = builder.length();
        if (len > 1) builder.replace(len - 1, len, "");
        builder.append("}");
        return builder.toString();
    }

    /**
     * The node of this list.
     * */
    public static class SNode<E> extends Node<E>
        implements SinglyNode<SNode<E>> {

        /** The next node, maybe null. */
        private SNode<E> next = null;

        /** {@inheritDoc} */
        @Override
        public SNode<E> getNext() {
            return next;
        }

        /** {@inheritDoc} */
        @Override
        public void setNext(SNode<E> node) {
            next = node;
        }

        /** {@inheritDoc} */
        @Override
        public boolean hasNext() {
            return next != null;
        }
    }
}
