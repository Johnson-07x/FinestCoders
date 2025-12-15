package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjList {
    // Each vertex has its own adjacency list
    ArrayList<ArrayList<Integer>> adjList;

    // Constructor: initialize adjacency list for all vertices
    AdjList(int vertices) {
        adjList = new ArrayList<>();
        for (int i = 0; i <= vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add an edge (u -> v)
    void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u); // if undirected graph
    }

    // Display adjacency list
    void display() {
        for (int i = 1; i < adjList.size(); i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int vertices = sc.nextInt();

        System.out.print("Enter the number of edges: ");
        int edges = sc.nextInt();

        AdjList graph = new AdjList(vertices);

        System.out.println("Enter each edge (u v):");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdge(u, v);
        }

        System.out.println("\nAdjacency List Representation:");
        graph.display();
    }
}
