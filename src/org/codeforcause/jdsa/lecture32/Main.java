package org.codeforcause.jdsa.lecture32;

public class Main {
    public static void main(String[] args) {
        AdjMapWeightGraph<Character> graph = new AdjMapWeightGraph<>();
        graph.addEdge('A', 'C', 2);
        graph.addEdge('A', 'B', 7);
        graph.addEdge('B', 'C', 6);
        graph.addEdge('B', 'F', 1);
        graph.addEdge('B', 'D', 4);
        graph.addEdge('D', 'F', 3);
        graph.addEdge('F', 'E', 2);

        System.out.println(graph.prims());
    }
}
