package org.codeforcause.jdsa.lecture33;

import java.util.*;

public class AdjMapWeightGraph<E> {
    private Map<E, Vertex> vertices = new HashMap<>();
    private Map<Vertex, Vertex> parents = new HashMap<>();

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

    public void generateParents() {
        for (Vertex vertex : vertices.values()) {
            parents.put(vertex, null);
        }
    }

    private Vertex find(Vertex vertex) {
        while (parents.get(vertex) != null) {
            vertex = parents.get(vertex);
        }
        return vertex;
    }

    private boolean union(Vertex first, Vertex second) {
        first = find(first);
        second = find(second);

        if (first != second) {
            parents.put(first, second);
            return true;
        }
        return false;
    }

    public int kruskal() {
        ArrayList<Edge> list = new ArrayList<>();
        for (Vertex start : vertices.values()) {
            for (Vertex end : start.neighbours.keySet()) {
                Integer weight = start.neighbours.get(end);
                list.add(new Edge(start, end, weight));
            }
        }

//        Collections.sort(list, new Comparator<Edge>() {
//            @Override
//            public int compare(Edge o1, Edge o2) {
//                return o1.weight - o2.weight;
//            }
//        });

//        Collections.sort(list, (o1, o2) -> o1.weight - o2.weight);

//        Collections.sort(list, Comparator.comparingInt(o -> o.weight));

        list.sort(Comparator.comparingInt(o -> o.weight));
        int costMst = 0;
        for (Edge edge : list) {
            if (union(edge.start, edge.end)) {
                costMst += edge.weight;
            }
        }
        return costMst;
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
