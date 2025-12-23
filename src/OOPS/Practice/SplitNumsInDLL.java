package OOPS.Practice;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class operations {
    Node head = null;
    Node tail = null;
    void insert(int n){
        Node nn = new Node(n);
        if (head == null){
            head = nn;
            tail = nn;
        }else {
            tail.next = nn;
            tail = nn;
        }
    }

    void display() {
        Node curr = head;
        while (curr != null){

        }
    }
}

public class SplitNumsInDLL {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of Elements: ");
        int size = sc.nextInt();
        operations op = new operations();
        for (int i = 0; i < size; i++){
            int n = sc.nextInt();
            op.insert(n);
        }
    }
}
