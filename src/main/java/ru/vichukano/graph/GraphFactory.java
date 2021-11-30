package ru.vichukano.graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class GraphFactory {

    public static Map<Node, List<Node>> createGraph() {
        Node a = new Node("A", 1);
        Node b = new Node("B", 2);
        Node c = new Node("C", 3);
        Node d = new Node("D", 4);
        Node e = new Node("E", 5);
        Node f = new Node("F", 6);
        Node g = new Node("G", 7);
        Node h = new Node("H", 8);
        Node i = new Node("I", 9);
        Map<Node, List<Node>> graph = new HashMap<>();
        graph.put(a, List.of(b, c, d));
        graph.put(b, List.of(e));
        graph.put(c, List.of(f, g));
        graph.put(d, List.of(h));
        graph.put(h, List.of(i));
        return graph;
    }

    public static class Node {
        String label;
        Integer value;
        boolean visited;

        public Node(String label, Integer value) {
            this.label = label;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return Objects.equals(label, node.label) && Objects.equals(value, node.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(label, value);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "label='" + label + '\'' +
                    ", value=" + value +
                    ", visited=" + visited +
                    '}';
        }
    }
}
