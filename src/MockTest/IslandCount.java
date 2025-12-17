package MockTest;

import java.util.Scanner;

public class IslandCount {
    static int m, n;
    static boolean visited[][];

    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    static void dfs(char[][] grid, int x, int y){

        visited[x][y] = true;

        for (int d = 0; d < 8; d++){
            int nx = m + dx[d];
            int ny = n + dy[d];

            if (nx >= 0 && nx < m && ny >=0 && ny < n &&
            grid[nx][ny] == 'L' && !visited[nx][ny]){
                dfs(grid, nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of Rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the no.of Columns: ");
        int n = sc.nextInt();

        char[][] grid = new char[m][n];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        visited = new boolean[m][n];
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j< n; j++){
                if (grid[i][j] == 'L' && !visited[i][j]){
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
