package OOPS.Practice;

import java.util.Scanner;

class Node2 {
    int data;
    Node2 next;
    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

class operations2 {
    Node2 head = null;
    Node2 tail = null;
    void insert(int n) {
        Node2 n2 = new Node2(n);
        if (head == null) {
            head = n2;
            tail = n2;
        }else {
            tail.next = n2;
            tail = n2;
        }
    }

    void display() {
        Node2 curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    void reverse() {
        Node2 prev = null;
        Node2 curr = head;
        Node2 next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}

public class ReverseLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of Nodes: ");
        int size = sc.nextInt();
        operations2 op2 = new operations2();
        for (int i = 0; i < size; i++) {
            int n = sc.nextInt();
            op2.insert(n);
        }
        op2.display();
        op2.reverse();
        op2.display();
    }
}
