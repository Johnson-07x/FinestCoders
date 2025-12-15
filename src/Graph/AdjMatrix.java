package Graph;

import java.util.Scanner;

public class AdjMatrix {
    int[][] adjDirected;
    int[][] adjUndirected;
    int n;
    AdjMatrix(int n){
        adjDirected = new int[n][n];
        adjUndirected = new int[n][n];
        this.n = n;
    }

    void createDirected(int u, int v){
        adjDirected[u][v] = 1;
    }

    void createUndirected(int u, int v){
        adjUndirected[u][v] = 1;
        adjUndirected[v][u] = 1;
    }

    void displayDirected(){
        System.out.println("Durected Array: ");
        for (int i = 1; i < n; i++){
            for (int j = 1; j < n; j++){
                System.out.print(adjDirected[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void displayUndirected(){
        System.out.println("Undirected Array: ");
        for (int i = 1; i < n; i++){
            for (int j = 1; j < n; j++){
                System.out.print(adjUndirected[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Vertex: ");
        int vertex = sc.nextInt();
        System.out.print("Enter the Number of Edges: ");
        int edges = sc.nextInt();

        AdjMatrix obj = new AdjMatrix(edges);

        for (int i = 0; i < edges; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            obj.createDirected(u, v);
            obj.createUndirected(u, v);
        }
        obj.displayDirected();
        obj.displayUndirected();
    }
}
