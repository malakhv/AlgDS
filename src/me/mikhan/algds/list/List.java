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

/**
 * Basic interface for a List (singly or doubly).
 *
 * @author Mikhail.Malakhov
 * */
public interface List<E> {

    /**
     * Add an element to this list.
     * */
    boolean add(E element);

    /**
     * Add an element to specified position in this list.
     * */
    boolean add(E element, int index);

    /**
     * @return An element by index from this list.
     * */
    E get(int index);

    /**
     * Remove element from this list by specified index.
     * @return True, if removing, otherwise false.
     * */
    boolean remove(int index);

    /**
     * Reverses the order of the elements in this list.
     * */
    void reverse();

    /**
     * @return True, if this list is empty.
     * */
    boolean isEmpty();

    /**
     * @return The number of elements in this list.
     * */
    int size();

}
