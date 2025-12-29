package Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Basic {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, ArrayList<Integer>> m = new HashMap<>();
        ArrayList<Integer> a ;
        System.out.print("Enter no.ok Elements: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int key = sc.nextInt();
            int val = sc.nextInt();
            m.computeIfAbsent(key, v -> new ArrayList<>()).add(val);
        }
        System.out.println(m);
    }
}
