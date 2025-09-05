package org.example.Course.Module2.Task11.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class CustomLinkedList<T> implements List<T> {
    private int size;
    private Node<T> lastNode;
    private Node<T> firstNode;

    public CustomLinkedList() {
        this.lastNode = null;
        this.firstNode = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(T t) {
        if (t == null) {
            return false;
        }
        Node<T> newNode = new Node<>(t);

        if (firstNode == null) {
            firstNode = newNode;
        } else {
            lastNode.next = newNode; //cox mentiqli hisse, firstle eyni obyekt
            newNode.prev = lastNode;
        }
        lastNode = newNode;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object data) {
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

    @Override
    public T get(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        return getNodeAtIndex(index).item;
    }

    @Override
    public boolean contains(Object data) {
        Node<T> current = firstNode;
        while (current != null) {
            if (current.item.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    @Override
    public T set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> current = getNodeAtIndex(index);
        T oldItem = current.item;
        current.item = element;
        return oldItem;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<T> current = firstNode;
        for (int i = 0; i < size; i++) {
            array[i] = current.item;
            current = current.next;
        }
        return array;
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == size) {
            add(element);
            return;
        }
        if (index == 0) {
            Node<T> newNode = new Node<>(element);
            newNode.next = firstNode;
            firstNode.prev = newNode;
            firstNode = newNode;
            size++;
            return;
        }

        Node<T> current = getNodeAtIndex(index);
        Node<T> newNode = new Node<>(element);

        newNode.prev = current.prev;
        newNode.next = current;
        current.prev.next = newNode;
        current.prev = newNode;
        size++;
    }

    //With AI help
    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<T> nodeToRemove = getNodeAtIndex(index);

        T item = nodeToRemove.item;

        if (nodeToRemove == firstNode) {
            firstNode = nodeToRemove.next;
            if (firstNode != null) firstNode.prev = null;
            else lastNode = null;
        } else if (nodeToRemove == lastNode) {
            lastNode = nodeToRemove.prev;
            lastNode.next = null;
        } else {
            nodeToRemove.prev.next = nodeToRemove.next;
            nodeToRemove.next.prev = nodeToRemove.prev;
        }

        size--;
        return item;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        Node<T> current = firstNode;

        if (o == null) {
            return -1;
        } else {
            while (current != null) {
                if (o.equals(current.item)) return index;
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    @Override
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

    private Node<T> getNodeAtIndex(int index) {
        Node<T> current;
        if (index < size / 2) {
            current = firstNode;
            for (int i = 0; i < index; i++) current = current.next;
        } else {
            current = lastNode;
            for (int i = size - 1; i > index; i--) current = current.prev;
        }
        return current;
    }

    //empty methods
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return List.of();
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
