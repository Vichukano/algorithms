package ru.vichukano.graph;

import ru.vichukano.graph.GraphFactory.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BreadthFirstSearch {

    public boolean search(Map<Node, List<Node>> graph, String label) {
        Queue<Node> queue = new LinkedList<>();
        Node start = graph.keySet().stream().findFirst().get();
        queue.add(start);
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            System.out.println("Node: " + n);
            if (n.visited) continue;
            if (n.label.equals(label)) {
                System.out.println("Node found: " + n + " ,search label: " + label);
                return true;
            }
            n.visited = true;
            final List<Node> nodes = graph.get(n);
            if (nodes != null) {
                queue.addAll(graph.get(n));
            }
        }
        return false;
    }
}
