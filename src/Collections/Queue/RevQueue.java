package Collections.Queue;

import java.util.*;

public class RevQueue {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of Elements: ");
        int size = sc.nextInt();
        Queue<Integer> q = new LinkedList<Integer>();
        Deque<Integer> q2 = new LinkedList<Integer>();
        Queue<Integer> q3 = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            int e = sc.nextInt();
            q.offer(e);
        }
        System.out.print("Enter the Number to Reverse From the Starting: ");
        int k = sc.nextInt();
        int remTimes = size - k;
        for (int i = 0; i < k; i++){
            int curr = q.poll();
            q2.add(curr);
        }
        for (int i = 0; i < k; i++){
            int curr = q2.pollLast();
            q3.offer(curr);
        }
        for (int i = 0 ; i < remTimes; i++){
            int curr = q.poll();
            q3.offer(curr);
        }
        for (int e : q3) {
            System.out.print(e + " ");
        }
    }
}
