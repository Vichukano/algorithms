package ru.vichukano.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class BubbleSorterTest {

    @Test
    void shouldSortList() {
        List<Long> longs = Stream.of(3L, 2L, 1L, 10L, -5L).collect(Collectors.toList());
        var sorter = new BubbleSorter();

        sorter.sort(longs);

        Assertions.assertEquals(-5L, longs.get(0));
        Assertions.assertEquals(1L, longs.get(1));
        Assertions.assertEquals(2L, longs.get(2));
        Assertions.assertEquals(3L, longs.get(3));
        Assertions.assertEquals(10L, longs.get(4));
    }

    @Test
    void shouldNotModifySortedList() {
        List<Integer> ints = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());
        var sorter = new BubbleSorter();

        sorter.sort(ints);

        Assertions.assertEquals(1, ints.get(0));
        Assertions.assertEquals(2, ints.get(1));
        Assertions.assertEquals(3, ints.get(2));
        Assertions.assertEquals(4, ints.get(3));
        Assertions.assertEquals(5, ints.get(4));
    }

}
