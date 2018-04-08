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
