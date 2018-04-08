package com.dvsdimas.app.list;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Objects;

/**
 * Created by dmylnev on 08.04.18.
 */

public class SinglyLinkedList<T> {

    private Node head;
    private int size = 0;

    private class Node {

        private Node next;
        private final T value;

        Node(T value) {
            this.value = value;
        }
    }

    public @Nullable T get(final int id) {

        if((id < 0) || (id >= size)) throw new IllegalArgumentException("id [" + id + "] out of bound exception");

        if(isEmpty()) throw new IllegalStateException("Cannot get element from empty list");

        Node current = head;

        for (int i = 0; i < size; i++) {
            if(i == id) {
                return current.value;
            } else {
                current = current.next;
            }
        }

        throw new IllegalStateException("Cannot get element with id[" + id + "] from the list");
    }

    public void add(@Nonnull final T element) {

        Objects.requireNonNull(element);

        final Node insert = new Node(element);

        insert.next = head;

        head = insert;

        size++;
    }

    public @Nullable T remove() {

        if(head == null) return null;

        final T ret = head.value;

        head = head.next;

        size--;

        return ret;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

}
