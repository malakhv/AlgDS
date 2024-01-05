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

package me.mikhan.algds.tree;

/**
 * Basic interface for Tree.
 *
 * @author Mikhail.Malakhov
 * */
public interface Tree<E> {

    /**
     * Add specified element to this tree.
     * */
    boolean add(E element);

    /**
     * @return The deep of this tree.
     * */
    int getDeep();

    /**
     * @return True, if this tree is empty.
     * */
    boolean isEmpty();

    /**
     * Clears this tree.
     * */
    void clear();

    /**
     * @return The number of elements in this tree.
     * */
    int size();
}
