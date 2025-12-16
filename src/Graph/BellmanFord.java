package Graph;

import java.util.*;

class Edge {
    int dest, wt;
    Edge(int d, int w) {
        dest = d;
        wt = w;
    }
}

public class BellmanFord {

    static void bellmanFord(List<List<Edge>> graph, int V, int src) {

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Step 1: Relax all edges V-1 times
        for (int i = 1; i <= V - 1; i++) {//Run atmost of v-1 times
            for (int u = 0; u < V; u++) {
                for (Edge e : graph.get(u)) {//
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[e.dest]) {
                        dist[e.dest] = dist[u] + e.wt;
                    }
                }
            }
        }

        // Step 2: Check for negative cycle
        for (int u = 0; u < V; u++) {
            for (Edge e : graph.get(u)) {
                if (dist[u] + e.wt < dist[e.dest]) {
                    System.out.println("Negative weight cycle detected!");
                    return;
                }
            }
        }

        // Print result
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of Vertices: ");
        int V = sc.nextInt();
        System.out.print("Enter the no.of Edges: ");
        int E = sc.nextInt();

        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }


        for (int i = 0; i < E; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            int wt = sc.nextInt();
            graph.get(src).add(new Edge(dest, wt));
        }

        System.out.print("Enter the Source Vertex: ");
        int src = sc.nextInt();

        bellmanFord(graph, V, src);
    }
}