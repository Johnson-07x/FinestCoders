package PracticeProblems;

import java.util.Scanner;
import java.util.Stack;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class operations {
    Node head = null;
    Node tail = null;
    Node kHead = null;
    Node kTail = null;
    void insert(int n) {
        Node nn = new Node(n);
        if (head == null) {
            head = nn;
            tail = nn;
        }else {
            tail.next = nn;
            tail = nn;
        }
    }

    void kNumLL(int size, int k) {
        if (size % k != 0) {
            System.out.println("List cannot be divided like this");
            return;
        }
        Node curr = head;
        for (int i = 0; i < size / k; i++) {
            int j = 0;
            StringBuilder s = new StringBuilder();
            while (j != k){
                s.append(curr.data);
                curr = curr.next;
                j++;
            }
            String temp = s.toString();
            int n = Integer.parseInt(temp);
            Node n2 = new Node(n);
            if (kHead == null) {
                kHead = n2;
                kTail = n2;
            }else {
                kTail.next = n2;
                kTail = n2;
            }
        }
    }

    void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    void kDisplay() {
        Node curr = kHead;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    void check() {
        Node curr = kHead;
        Stack<Integer> s = new Stack<>();
        while (curr != null) {
            s.push(curr.data);
            curr = curr.next;
        }

        Node curr2 = kHead;
        while (curr2 != null) {
            int e = s.pop();
            int num = curr2.data;
            int revNum = 0;
            while (num != 0) {
                int rem = num % 10;
                revNum = (revNum * 10) + rem;
                num /= 10;
            }
            if (curr2.data != e || curr2.data != revNum) {
                System.out.println("This LinkedList is not a Palindrome");
                return;
            }
            curr2 = curr2.next;
        }
        System.out.println("This L:nkedList is a Palindrome");
    }
}

public class PalindromeLL {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of Elements: ");
        int size = sc.nextInt();
        operations op = new operations();
        for (int i = 0; i < size; i++) {
            int n = sc.nextInt();
            op.insert(n);
        }
        System.out.print("Enter the K value: ");
        int k = sc.nextInt();
        op.display();
        op.kNumLL(size, k);
        op.kDisplay();
        op.check();
    }
}
