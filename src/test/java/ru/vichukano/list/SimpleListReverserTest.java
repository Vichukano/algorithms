package ru.vichukano.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleListReverserTest {
    private final SimpleListReverser testTarget = new SimpleListReverser();

    @Test
    void shouldReverse() {
        SimpleLinkedList list = new SimpleLinkedList(1_000);
        assertEquals(0, list.head.value);
        System.out.println("Original:\n" + list);
        testTarget.reverse(list);
        assertEquals(1_000 - 1, list.head.value);
        System.out.println("Reversed:\n" + list);
    }
}