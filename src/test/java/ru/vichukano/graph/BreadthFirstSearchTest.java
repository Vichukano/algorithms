package ru.vichukano.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BreadthFirstSearchTest {
    private final BreadthFirstSearch testTarget = new BreadthFirstSearch();

    @Test
    void shouldSearch() {
        var graph = GraphFactory.createGraph();
        System.out.println("Graph for search:\n" + graph);
        assertTrue(testTarget.search(graph, "I"));
        assertFalse(testTarget.search(graph, "K"));
    }
}