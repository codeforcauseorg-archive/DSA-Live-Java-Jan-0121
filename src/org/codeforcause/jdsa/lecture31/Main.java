package org.codeforcause.jdsa.lecture31;

public class Main {
    public static void main(String[] args) {
        AdjacencyListGraph<Character> graph = new AdjacencyListGraph<>();
        graph.addEdge('A', 'C');
        graph.addEdge('A', 'B');
        graph.addEdge('D', 'C');
        graph.addEdge('B', 'D');
        graph.addEdge('B', 'E');

        graph.BFT('A');
        System.out.println();
        graph.print();
    }
}
