package Graph;

import java.util.*;

class pair1{
    int v, w;
    pair1(int v, int w){
        this.v = v;
        this.w = w;
    }
}

public class BellmanFord {

    static void dijkstra(int src, List<List<pair1>> graph, int n){
        int[] dis = new int[n];
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[src] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        pq.add(new int[]{0, src});

        while (!pq.isEmpty()){
            int cur[] = pq.poll();
            int d = cur[0];
            int u = cur[1];

            for (int i = 0; i < n - 1; i++){
            //Relaxation
                for (pair1 g : graph.get(u)){
                    int v = g.v;
                    int w = g.w;
                    if (dis[u] + w < dis[v]){
                        dis[v] = dis[u] + w;
                        pq.add(new int[]{dis[v], v});
                    }
                }
            }
        }

        // ✅ (GPT response) Print distances properly
        System.out.println("Vertex\tDistance from Source " + src);
        for (int i = 0; i < n; i++){
            if (dis[i] == Integer.MAX_VALUE)
                System.out.println(i + "\tINF");
            else
                System.out.println(i + "\t" + dis[i]);
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of Vertices: ");
        int vertices = sc.nextInt();
        System.out.print("Enter the no.of Edges: ");
        int edges = sc.nextInt();

        List<List<pair1>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++){
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edges; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph.get(u).add(new pair1(v, w));
            graph.get(v).add(new pair1(u, w));
        }
        System.out.print("Enter the Source: ");
        int src = sc.nextInt();
        dijkstra(src, graph, edges);
    }
}
