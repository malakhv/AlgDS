package com.malakhv.algds.tree;

/**
 * Created by malakhv on 16.05.17.
 */
public interface Tree<E> {

    /** Add specified element to this tree. */
    boolean add(E element);

    int getDeep();

    /** @return True, if this list is empty. */
    boolean isEmpty();

    /** Clear this tree. */
    void clear();

    /** @return The number of elements in this list. */
    int size();
}