package Tasks.Day_27_12_2025;

import java.util.Scanner;

public class ImageProcessing {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the grid size (m x n) : ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] newArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newArr[i][j] = arr[i][n-1-j];
                if (newArr[i][j] == 0) {
                    newArr[i][j] = 1;
                }else {
                    newArr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
