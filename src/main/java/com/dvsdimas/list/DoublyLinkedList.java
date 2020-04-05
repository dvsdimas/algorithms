package com.dvsdimas.list;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Objects;

/**
 * Created by dmylnev on 08.04.18.
 */

public class DoublyLinkedList<T> {

    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {

        private Node next;
        private Node previous;
        private final T value;

        Node(T value) {
            this.value = value;
        }
    }

    public @Nonnull T getFromHead(final int id) {

        if((id < 0) || (id >= size)) throw new IllegalArgumentException("id [" + id + "] out of bound exception");

        if(isEmpty()) throw new IllegalStateException("Cannot get element from empty linked list");

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

    public @Nonnull T getFromTail(final int id) {

        if((id < 0) || (id >= size)) throw new IllegalArgumentException("id [" + id + "] out of bound exception");

        if(isEmpty()) throw new IllegalStateException("Cannot get element from empty list");

        Node current = tail;

        for (int i = 0; i < size; i++) {
            if(i == id) {
                return current.value;
            } else {
                current = current.previous;
            }
        }

        throw new IllegalStateException("Cannot get element with id[" + id + "] from the list");
    }

    public void addHead(@Nonnull final T element) {

        Objects.requireNonNull(element);

        final Node insert = new Node(element);

        if(head == null) {
            head = tail = insert;
        } else {
            insert.next = head;
            head.previous = insert;
            head = insert;
        }

        size++;
    }

    public void addTail(@Nonnull final T element) {

        Objects.requireNonNull(element);

        final Node insert = new Node(element);

        if(tail == null) {
            head = tail = insert;
        } else {
            insert.previous = tail;
            tail.next = insert;
            tail = insert;
        }

        size++;
    }


    public @Nullable T removeHead() {

        if(head == null) return null;

        final T ret = head.value;

        if(head.next != null) {
            head.next.previous = null;
            head = head.next;
        } else {
            head = tail = null;
        }

        size--;

        return ret;
    }

    public @Nullable T removeTail() {

        if(tail == null) return null;

        final T ret = tail.value;

        if(tail.previous != null) {
            tail.previous.next = null;
            tail = tail.previous;
        } else {
            head = tail = null;
        }

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
