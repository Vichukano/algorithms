package ru.vichukano.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class BubbleSortingTest {

    @Test
    void shouldSortList() {
        List<Long> ints = Stream.of(3L, 2L, 1L).collect(Collectors.toList());
        var sorter = new BubbleSorter();

        sorter.sort(ints);

        Assertions.assertEquals(1, ints.get(0));
        Assertions.assertEquals(2, ints.get(1));
        Assertions.assertEquals(3, ints.get(2));
    }

}