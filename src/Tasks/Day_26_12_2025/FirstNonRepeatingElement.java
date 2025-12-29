package Tasks.Day_26_12_2025;

import java.util.*;

public class FirstNonRepeatingElement {
    static void check(Queue<Integer> q) {
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int e : q) {
            if (!s.contains(e)){
                s.add(e);
                q2.add(e);
                int first = q2.peek();
                System.out.print(first + " ");
            }
            else  {
                q2.remove(e);
                int first;
                if (q2.isEmpty()) {
                    first = -1;
                }else {
                    first = q2.peek();
                }
                System.out.print(first + " ");
            }
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        System.out.print("Enter no.of Elements: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int n = sc.nextInt();
            q.add(n);
        }
        check(q);
    }
}
