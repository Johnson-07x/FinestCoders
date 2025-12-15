package Graph;

import java.util.Scanner;

public class DepthFirstSearch {
    int vertices;
    int[][] adj;

    // Constructor: initialize adjacency matrix
    DepthFirstSearch(int vertices) {
        this.vertices = vertices;
        adj = new int[vertices + 1][vertices + 1]; // +1 if using 1-based indexing
    }

    // Add edge (undirected graph)
    void addEdge(int u, int v) {
        adj[u][v] = 1;
        adj[v][u] = 1;
    }

    // Recursive DFS
    void DFSrec(int start, boolean[] vis) {
        vis[start] = true;
        System.out.print(start + " ");
        for (int i = 1; i <= vertices; i++) {   // start from 1 if 1-based
            if (!vis[i] && adj[start][i] == 1) {
                DFSrec(i, vis);
            }
        }
    }

    // DFS wrapper
    void DFS(int st) {
        boolean[] vis = new boolean[vertices + 1]; // +1 for 1-based indexing
        System.out.println("DFS Traversal starting from vertex " + st + ":");
        DFSrec(st, vis);
        System.out.println();
    }

    // Display adjacency matrix
    void display() {
        System.out.println("Adjacency Matrix:");
        for (int i = 1; i <= vertices; i++) {
            for (int j = 1; j <= vertices; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Vertex: ");
        int vertex = sc.nextInt();
        System.out.print("Enter the Number of Edges: ");
        int edges = sc.nextInt();

        DepthFirstSearch obj = new DepthFirstSearch(vertex);

        System.out.println("Enter each edge (u v):");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            obj.addEdge(u, v);
        }

        obj.display();

        System.out.print("Enter the starting vertex for DFS: ");
        int start = sc.nextInt();
        obj.DFS(start);
    }
}
