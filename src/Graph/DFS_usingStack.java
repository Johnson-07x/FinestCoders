package Graph;//DFS (Using Stack)

import java.util.*;

class DFS_usingStack {
    int[][] adjMatrix;
    int vertices;


    DFS_usingStack(int v) {
        vertices = v;
        adjMatrix = new int[v][v];
    }


    void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;

    }

    void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");


                for (int i = vertices - 1; i >= 0; i--) {
                    if (adjMatrix[node][i] == 1 && !visited[i]) {
                        stack.push(i);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int v = sc.nextInt();


        int e = sc.nextInt();

        DFS_usingStack g = new DFS_usingStack(v);


        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v2 = sc.nextInt();
            g.addEdge(u, v2);
        }


        int start = sc.nextInt();

        System.out.print("DFS Traversal: ");
        g.dfs(start);
    }
}