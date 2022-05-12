package ru.vichukano.sorting;

import java.util.List;
import java.util.Objects;

public class BubbleSorter {

    public <E extends Comparable<E>> void sort(List<E> list) {
        if (Objects.isNull(list)) {
            throw new IllegalArgumentException("Can not sort null");
        }
        if (list.isEmpty() || list.size() == 1) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                var current = list.get(j);
                var next = (E) list.get(j + 1);
                if (current.compareTo(next) > 0) {
                    list.set(j, next);
                    list.set(j + 1, current);
                }
            }
        }
    }

}
