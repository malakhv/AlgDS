/* *
 * Copyright (C) 2012 Mikhail Malakhov <malakhv@live.ru>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * */

package com.malakhv.algds.list;

/**
 * Basic node class for linked list.
 * @author Mikhail.Malakhov [malakhv@live.ru|https://github.com/malakhv]
 * */
public class Node<E> {

    /** The data element of this node. */
    private E element = null;

    /**
     * @return The data element of this node.
     * */
    public E get() { return element; }

    /**
     * Set a new data element for this node.
     * */
    public void set(E value) { element = value; }

    /**
     * @return True, if this node has data, false otherwise.
     * */
    public boolean has() { return element != null; }

    /**
     * Returns a string representation of the data element in this node.
     * */
    @Override
    public String toString() { return String.valueOf(element); }
}