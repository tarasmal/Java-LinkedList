package com.example.project1.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomLinkedList<T> implements Iterable<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void add(T value) {
        Node<T> newNode = new Node<>(value, null);
        if (head == null) {
            tail = newNode;
            head = tail;
        }
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public static <U> void printAllNodesOf(CustomLinkedList<U> list) {
        for (U node : list) {
            System.out.println(node);
        }
    }

    public void reverseNodesLinksDirections() {
        this.tail = this.head;
        this._reverseNodesLinksDirections(this.head);

    }
    private Node<T> _reverseNodesLinksDirections(Node<T> node) {
        if (node.next != null) {
            Node<T> previousNode = _reverseNodesLinksDirections(node.next);
            previousNode.next = node;
            node.next = null;

        }
        else {
            head = node;
        }

        return node;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Node<T> currentNode = head;
            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                if (!(hasNext())) {
                    throw new NoSuchElementException();
                }
                else {
                    T value = currentNode.value;
                    currentNode = currentNode.next;
                    return value;
                }

            }
        };
    }

    public int getSize() {
        return size;
    }
}
