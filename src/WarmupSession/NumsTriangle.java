package WarmupSession;

import java.util.Scanner;

public class NumsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of Rows: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int z = 0; z <= i; z++){
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (num - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < num; i++) {
            for (int z = 0; z < num - i; z++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
