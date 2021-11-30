package ru.vichukano.list;

import ru.vichukano.list.SimpleLinkedList.Node;

public class SimpleListReverser {

    public void reverse(SimpleLinkedList list) {
        Node prev = null;
        Node curr = list.head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        list.head = prev;
    }

}
