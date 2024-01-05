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
 * @author Mikhail.Malakhov
 * */
public class DoublyLinkedList<E> implements List<E> {
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
