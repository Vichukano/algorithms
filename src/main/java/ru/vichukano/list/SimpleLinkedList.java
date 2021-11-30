package ru.vichukano.list;

public class SimpleLinkedList {
    private final int size;
    Node head;

    public SimpleLinkedList(int size) {
        if (size <= 0) throw new IllegalArgumentException("Size should be greater then 0, size = " + size);
        this.size = size;
        head = new Node(0);
        Node curr = head;
        for (int i = 1; i < size; i++) {
            Node next = new Node(i);
            curr.next = next;
            curr = next;
        }
    }

    @Override
    public String toString() {
        return "SimpleLinkedList[size=" + size + ", list=" + printList() + ']';
    }

    private String printList() {
        StringBuilder sb = new StringBuilder();
        Node curr = head;
        while (curr != null) {
            sb.append("[").append(curr.value).append("]").append("-");
            curr = curr.next;
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static class Node {
        final Integer value;
        Node next;

        public Node(Integer value) {
            this.value = value;
        }

    }
}
