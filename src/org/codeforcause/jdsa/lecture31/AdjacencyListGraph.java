package org.codeforcause.jdsa.lecture31;

import java.util.*;

public class AdjacencyListGraph <E> {
    private Map<E, Vertex> vertices = new HashMap<>();

    private class Vertex {
        E value;
        List<Vertex> neighbours;
        public Vertex(E value) {
            this.value = value;
            this.neighbours = new LinkedList<>();
        }
    }

    public void addVertex(E value) {
        if (vertices.get(value) == null) {
            vertices.put(value, new Vertex(value));
        }
    }

    public void addEdge(E first, E second) {
        Vertex f = vertices.get(first);
        Vertex s = vertices.get(second);
        if (f == null) {
            addVertex(first);
            f = vertices.get(first);
        }
        if (s == null) {
            addVertex(second);
            s = vertices.get(second);
        }
        f.neighbours.add(s);
        s.neighbours.add(f);
    }

    public void DFT(E start) {
        Vertex v = vertices.get(start);
        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> visited = new HashSet<>();
        stack.push(v);
        visited.add(v);
        while (!stack.isEmpty()) {
            Vertex currentVertex = stack.pop();
            System.out.print(currentVertex.value + " ");
            for (Vertex padosi : currentVertex.neighbours) {
                if (!visited.contains(padosi)) {
                    stack.push(padosi);
                    visited.add(padosi);
                }
            }
        }
    }

    public void BFT(E start) {
        Vertex v = vertices.get(start);
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();
        queue.add(v);
        visited.add(v);
        while (!queue.isEmpty()) {
            Vertex currentVertex = queue.remove();
            System.out.print(currentVertex.value + " ");
            for (Vertex padosi : currentVertex.neighbours) {
                if (!visited.contains(padosi)) {
                    queue.add(padosi);
                    visited.add(padosi);
                }
            }
        }
    }

    public void print() {
        for (Vertex vertex : vertices.values()) {
            System.out.print(vertex.value + "->");
            for (Vertex padosi : vertex.neighbours) {
                System.out.print(padosi.value + " ");
            }
            System.out.println();
        }
    }
}
