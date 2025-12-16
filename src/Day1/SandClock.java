package Day1;

public class SandClock {
    public static void main(String[] args) {
        int n = 9;

        for (int stars = n; stars >= 1; stars -= 2) {
            printRow(stars, n);
        }

        for (int stars = 3; stars <= n; stars += 2) {
            printRow(stars, n);
        }
    }

    static void printRow(int stars, int max) {
        int spaces = (max - stars) / 2;

        for (int i = 0; i < spaces; i++) {
            System.out.print("  ");
        }

        for (int i = 0; i < stars; i++) {
            System.out.print("*");
            if (i < stars - 1) System.out.print(" ");
        }

        System.out.println();
    }
}
