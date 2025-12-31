package ExceptionHandling;

import java.util.Scanner;

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

    void displayNthValue(int n, int size) {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            if (n < 0 || n > size){
                throw new IndexOutOfBoundsException("Index " + n + " is OutOfBound");
            }
            if (count == n){
                System.out.print(curr.data);
            }
            curr = curr.next;
        }
    }
}

public class LinkedListException {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of Elements: ");
        int size = sc.nextInt();
        operations op = new operations();
        for (int i = 0; i < size; i++) {
            int n = sc.nextInt();
            op.insert(n);
        }
        op.display();
        System.out.print("Enter nth value to print from the LinkedList: ");
        int n = sc.nextInt();
        try {
            op.displayNthValue(n, size);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
