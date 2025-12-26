package Tasks.Day_22_12_2025;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class operation{
    Node oddHead = null;
    Node evenHead = null;
    Node oddTail = null;
    Node evenTail = null;
    Node head = null;
    Node tail = null;
    void insert(int n){

        Node nn = new Node(n);
        if (head == null){
            head = nn;
            tail = nn;
        }
        else {
            tail.next = nn;
            tail = nn;
        }
    }
    void splitLL() {
        int pos = 1;
        Node curr = head;
        while (curr != null) {
            Node n1 = new Node(curr.data);
            if (pos % 2 != 0) {
                if (oddHead == null) {
                    oddHead = n1;
                    oddTail = n1;
                }else {
                    oddTail.next = n1;
                    oddTail = n1;
                }
            }else {
                if (evenHead == null) {
                    evenHead = n1;
                    evenTail = n1;
                }else {
                    evenTail.next = n1;
                    evenTail = n1;
                }
            }
            pos++;
            curr = curr.next;
        }
    }
    void display(){
        Node curr = head;

        while (curr != null){
            System.out.print(curr.data);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }

        System.out.println();
    }
    void displayOdd(){
        Node curr = oddHead;

        while (curr != null){
            System.out.print(curr.data);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }

        System.out.println();
    }
    void displayEven(){
        Node curr = evenHead;

        while (curr != null){
            System.out.print(curr.data);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }

        System.out.println();
    }
}

public class SplitInto2LL {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Linked List Size: ");
        int size = sc.nextInt();
        operation op = new operation();
        for (int i = 0; i < size; i++){
            int n = sc.nextInt();
            op.insert(n);
        }
        System.out.print("Normal Traversal: ");
        op.display();
        op.splitLL();
        System.out.print("Odd LL Traversal: ");
        op.displayOdd();
        System.out.print("Even LL traversal: ");
        op.displayEven();
    }
}
