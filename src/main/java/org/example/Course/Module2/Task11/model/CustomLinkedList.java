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
        return size == 0;
    }

    public void add(T t) {
        Node<T> newNode = new Node<>(t);

        if (firstNode == null) {
            firstNode = newNode;
        } else {
            lastNode.next = newNode; //cox mentiqli hisse, firstle eyni obyekt
            newNode.prev = lastNode;
        }
        lastNode = newNode;
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

        if (current == firstNode) {
            firstNode = firstNode.next;
            if (firstNode != null) {
                firstNode.prev = null;
            } else {
                lastNode = null;
            }
        } else if (current == lastNode) {
            lastNode = lastNode.prev;
            lastNode.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
        return true;
    }

    public T get(int index) {
        Node<T> current;

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (index < size / 2) {
            current = firstNode;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = lastNode;

            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current.item;
    }

    public boolean contains(T data) {
        Node<T> current = firstNode;
        while (current != null) {
            if (current.item.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    public void set(int index, T data) {
        Node<T> current;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (index <= size / 2) {
            current = firstNode;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = lastNode;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        current.item = data;
    }

    public String toString() {
        if (firstNode == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");

        Node<T> current = firstNode;
        for (int i = 0; i < size; i++) {
            sb.append(current.item);
            current = current.next;
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
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
