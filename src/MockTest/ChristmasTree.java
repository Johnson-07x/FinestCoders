package MockTest;

import java.util.*;

class ChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        if(n % 2 ==1){

            int mid = n / 2;
            int left = mid, right = mid;

            int leadingSpaces = mid;
            int innerSpaces = 0;
            int row = n/2 + 1;
            int line = 1;

            while (left >= 0 && right < n) {

                // leading spaces
                for (int i = 0; i < leadingSpaces; i++)
                    System.out.print("  ");

                if (left == right) {
                    System.out.println(s.charAt(mid));
                }
                else {
                    if(row % 2 == 1)
                    { // Odd Rows
                        if (line % 2 == 0) { // even lines
                            // right then left
                            System.out.print(s.charAt(right));
                            for (int i = 0; i < innerSpaces; i++)
                                System.out.print("  ");
                            System.out.println(s.charAt(left)+"  ");
                        }
                        else { //odd Line
                            // left then right
                            System.out.print(s.charAt(left));
                            for (int i = 0; i < innerSpaces; i++)
                                System.out.print("  ");
                            System.out.println(s.charAt(right)+"  ");
                        }
                    }
                    else
                    { // even Rows
                        if (line % 2 == 1) {
                            // right then left
                            System.out.print(s.charAt(right));
                            for (int i = 0; i < innerSpaces; i++)
                                System.out.print("  ");
                            System.out.println(s.charAt(left)+"  ");
                        }
                        else {
                            // left then right
                            System.out.print(s.charAt(left));
                            for (int i = 0; i < innerSpaces; i++)
                                System.out.print("  ");
                            System.out.println(s.charAt(right)+"  ");
                        }
                    }

                }

                left--;
                right++;
                leadingSpaces--;
                innerSpaces += 2;
                row++;
            }
        }
        else{
            int mid2 = n / 2;
            int mid1 = mid2-1;

            int right = mid2;
            int left = mid1;

            int leadingSpaces = mid2;
            int innerSpaces = 0;
            int row = n/2 ;
            int line = 1;

            while (left >= 0 && right < n) {

                // leading spaces
                for (int i = 0; i < leadingSpaces; i++)
                    System.out.print("  ");

                if (right - left == 1) {
                    System.out.print(s.charAt(mid2));
                    System.out.print(s.charAt(mid1));
                    System.out.println();
                }
                else {
                    if(row % 2 == 1)
                    { // Odd Rows
                        if (line % 2 == 0) { // even lines
                            // right then left
                            System.out.print(s.charAt(right));
                            for (int i = 0; i < innerSpaces; i++)
                                System.out.print("  ");
                            System.out.println(s.charAt(left)+"  ");
                        }
                        else { //odd Line
                            // left then right
                            System.out.print(s.charAt(left));
                            for (int i = 0; i < innerSpaces; i++)
                                System.out.print("  ");
                            System.out.println(s.charAt(right)+"  ");
                        }
                    }
                    else
                    { // even Rows
                        if (line % 2 == 1) {
                            // right then left
                            System.out.print(s.charAt(right));
                            for (int i = 0; i < innerSpaces; i++)
                                System.out.print("  ");
                            System.out.println(s.charAt(left)+"  ");
                        }
                        else {
                            // left then right
                            System.out.print(s.charAt(left));
                            for (int i = 0; i < innerSpaces; i++)
                                System.out.print("  ");
                            System.out.println(s.charAt(right)+"  ");
                        }
                    }

                }

                left--;
                right++;
                leadingSpaces--;
                innerSpaces += 2;
                row++;
            }
        }
    }
}
