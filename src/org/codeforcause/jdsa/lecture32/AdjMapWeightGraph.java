package org.codeforcause.jdsa.lecture32;

import java.util.*;

public class AdjMapWeightGraph<E> {
    private Map<E, Vertex> vertices = new HashMap<>();

    private class Vertex {
        E value;
        Map<Vertex, Integer> neighbours;
        public Vertex(E value) {
            this.value = value;
            this.neighbours = new HashMap<>();
        }
        public void addNeighbours(Vertex vertex, Integer weight) {
            neighbours.put(vertex, weight);
        }
    }

    private class Edge {
        public Vertex start, end;
        public Integer weight;
        public Edge(Vertex start, Vertex end, Integer weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
    }

    public void addVertex(E value) {
        if (!vertices.containsKey(value)) {
            vertices.put(value, new Vertex(value));
        }
    }

    public void addEdge(E start, E end, Integer weight) {
        Vertex s = vertices.get(start);
        Vertex e = vertices.get(end);
        if(s == null) {
            addVertex(start);
            s = vertices.get(start);
        }
        if (e == null) {
            addVertex(end);
            e = vertices.get(end);
        }
        s.addNeighbours(e, weight);
        e.addNeighbours(s, weight);
    }

    public int prims() {
        Vertex start = vertices.values().iterator().next();
        Set<Vertex> visited = new HashSet<>();
        PriorityQueue<Edge> pq = new PriorityQueue<>((Comparator<Edge>) (o1, o2) -> o1.weight - o2.weight);
        visited.add(start);
        for (Vertex end : start.neighbours.keySet()) {
            int weight = start.neighbours.get(end);
            pq.add(new Edge(start, end, weight));
        }
        int mstCost = 0;
        while (!pq.isEmpty()) {
            Edge edge = pq.remove();
            if (!visited.contains(edge.end)) {
                mstCost += edge.weight;
                start = edge.end;
                visited.add(start);
                for (Vertex end : start.neighbours.keySet()) {
                    if (!visited.contains(end)) {
                        int weight = start.neighbours.get(end);
                        pq.add(new Edge(start, end, weight));
                    }
                }
            }
        }
        return mstCost;
    }
}
