package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_usingQueue {
    ArrayList<ArrayList<Integer>> adjList;
    int vertices;
    BFS_usingQueue(int vertices){
        this.vertices = vertices;
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++){
            adjList.add(new ArrayList<>());
        }
    }

    void create(int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    void display(int start){
        boolean[] visited = new boolean[vertices];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        System.out.print("BFS Traversal: ");
        while (!q.isEmpty()){
            int current = q.poll();
            System.out.print(current + " ");

            for (int neighbour : adjList.get(current)){
                if (!visited[neighbour]){
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
        System.out.println();
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of vertices: ");
        int vertices = sc.nextInt();
        System.out.print("Enter the no.of the Edges: ");
        int edges = sc.nextInt();

        BFS_usingQueue graph = new BFS_usingQueue(vertices);
        for (int i = 0; i < edges; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.create(u, v);
        }
        System.out.print("Enter the starting Element to do BFS Traverse: ");
        int start = sc.nextInt();
        graph.display(start);
    }
}