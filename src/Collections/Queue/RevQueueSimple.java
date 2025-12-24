package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RevQueueSimple {
    static void rev(Queue<Integer> q, int k) {
        if (k == 0) {
            return;
        }
        int curr = q.poll();

        rev(q, k - 1);

        q.add(curr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of Elements: ");
        int size = sc.nextInt();
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            int e = sc.nextInt();
            q.offer(e);
        }
        System.out.print("Enter the Elements to rev from the front: ");
        int k = sc.nextInt();
        int rem = size - k;
        rev(q, k);
        for (int i = 0; i < rem; i++) {
            q.offer(q.poll());
        }
        for (int e : q) {
            System.out.print(e + " ");
        }
    }
}
