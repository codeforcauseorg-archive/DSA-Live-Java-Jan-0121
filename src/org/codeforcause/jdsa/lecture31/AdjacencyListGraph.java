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

    public List<LinkedList<E>> connectedComponents() {
        List<LinkedList<E>> list = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();
        for (Vertex start : vertices.values()) {
            if (visited.contains(start)) {
                continue;
            }
            LinkedList<E> tempList = new LinkedList<>();
            Stack<Vertex> stack = new Stack<>();
            stack.push(start);
            visited.add(start);
            while (!stack.isEmpty()) {
                Vertex currentVertex = stack.pop();
                tempList.add(currentVertex.value);
                for (Vertex padosi : currentVertex.neighbours) {
                    if (!visited.contains(padosi)) {
                        stack.push(padosi);
                        visited.add(padosi);
                    }
                }
            }
            list.add(tempList);
        }
        return list;
    }

    public boolean isConnected() {
        return this.connectedComponents().size() < 2;
    }

    public boolean isBipartite() {
        Set<Vertex> red = new HashSet<>();
        Set<Vertex> blue = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();
        for (Vertex vertex : vertices.values()) {
            if (!red.contains(vertex) && !blue.contains(vertex)){
                stack.push(vertex);
                red.add(vertex);
                while (!stack.isEmpty()) {
                    Vertex current = stack.pop();
                    for (Vertex padosi : current.neighbours) {
                        if (red.contains(current)) {
                            if (red.contains(padosi)){
                                return false;
                            } else {
                                if (!blue.contains(padosi)) {
                                    stack.push(padosi);
                                    blue.add(padosi);
                                }
                            }
                        } else {
                            if (blue.contains(padosi)){
                                return false;
                            } else {
                                if (!red.contains(padosi)) {
                                    stack.push(padosi);
                                    red.add(padosi);
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
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
