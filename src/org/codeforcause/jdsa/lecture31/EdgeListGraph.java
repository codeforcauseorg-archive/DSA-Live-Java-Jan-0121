package org.codeforcause.jdsa.lecture31;

import java.util.LinkedList;

public class EdgeListGraph <E> {
    public LinkedList<Vertex> vertices;
    public LinkedList<Edge> edges;

    EdgeListGraph() {
        this.vertices = new LinkedList<>();
        this.edges = new LinkedList<>();
    }

    private class Vertex {
        private E value;
        public Vertex(E value) {
            this.value = value;
        }
    }

    private class Edge {
        private Vertex start;
        private Vertex end;
        public Edge (Vertex start, Vertex end) {
            this.start = start;
            this.end = end;
        }
    }

    public void addVertex(E value) {
        if (find(value) == null) {
            vertices.add(new Vertex(value));
        }
    }

    private Vertex find(E value) {
        for (Vertex vertex : vertices) {
            if (vertex.value.equals(value)) {
                return vertex;
            }
        }
        return null;
    }

    public void addEdge(E value1, E value2) {
        Vertex vertex1 = find(value1);
        Vertex vertex2 = find(value2);
        if (vertex1 == null) {
            addVertex(value1);
            vertex1 = find(value1);
        }
        if (vertex2 == null) {
            addVertex(value2);
            vertex2 = find(value2);
        }
        edges.add(new Edge(vertex1, vertex2));
        edges.add(new Edge(vertex2, vertex1));
    }
}
