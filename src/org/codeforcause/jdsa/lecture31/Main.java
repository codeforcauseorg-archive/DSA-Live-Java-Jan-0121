package org.codeforcause.jdsa.lecture31;

public class Main {
    public static void main(String[] args) {
        AdjacencyListGraph<Character> graph = new AdjacencyListGraph<>();
        graph.addEdge('A', 'C');
        graph.addEdge('A', 'B');
        graph.addEdge('C', 'D');
//        graph.addEdge('F', 'C');
//        graph.addEdge('C', 'E');
        graph.addEdge('D', 'E');
        graph.addEdge('E', 'F');
        graph.addVertex('G');
        graph.addEdge('F', 'G');
//        graph.BFT('A');
//        System.out.println();
//        graph.print();

        System.out.println(graph.connectedComponents());
        System.out.println(graph.isConnected());
        System.out.println(graph.isBipartite());
    }
}
