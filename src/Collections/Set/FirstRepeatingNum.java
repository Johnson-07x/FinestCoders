package Collections.Set;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstRepeatingNum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s = new LinkedHashSet<>();
        int[] arr = {1, 2, 3, 1, 2};
        for (int a : arr) {
            if (s.contains(a)){
                System.out.println(a + " " + "Already Contains");
                break;
            } else {
                s.add(a);
            }
        }
        if (arr.length == s.size()) {
            System.out.println("No Repeating Chars");
        }
    }
}
