package org.example.Course.Module2.Task11.model;

public final class CustomLinkedList<T> {
    private int size;
    private Node<T> lastNode;
    private Node<T> firstNode;

    public CustomLinkedList() {
        this.lastNode = null;
        this.firstNode = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return  size == 0;
    }

    public void add(T t) {
        Node<T> newNode = new Node<>(t);

        if(firstNode == null) {
            firstNode =  newNode;
        }
        else {
            lastNode.next = newNode; //cox mentiqli hisse, firstle eyni obyekt
            newNode.prev = lastNode;
        }
        lastNode =  newNode;
        size++;
    }

    public boolean remove(T data) {
        Node<T> current = firstNode;

        while (current != null && !current.item.equals(data)) {
            current = current.next;
        }

        if (current == null) {
            return false;
        }

        if(current == firstNode) {
            firstNode = firstNode.next;
            if(firstNode != null) {
                firstNode.prev = null;
            }
            else {
                lastNode = null;
            }
        }

        else if(current == lastNode) {
            lastNode = lastNode.prev;
            lastNode.next = null;
        }

        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
        return true;
    }

    private static class Node<E> {
        E item;
        CustomLinkedList.Node<E> next;
        CustomLinkedList.Node<E> prev;

        Node(E item) {
            this.item = item;
            this.next = null;
            this.prev = null;
        }
    }
}
