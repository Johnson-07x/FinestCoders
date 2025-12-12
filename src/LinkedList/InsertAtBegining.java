package LinkedList;

import java.util.Scanner;

class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data = data;
        this.next = null;
    }
}

class operations2{
    Node2 head = null;
    Node2 tail = null;
    void insert(int n){
        Node2 n2 = new Node2(n);
        if (head == null){
            head = n2;
            tail = n2;
        }
        else {
            n2.next = head;
            head = n2;
        }
    }

    void display(){
        Node2 curr = head;

        while (curr != null){
            System.out.print(curr.data);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }

        System.out.println();
    }
}

public class InsertAtBegining {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the LinkedList.LinkedList Size: ");
        int size = sc.nextInt();
        operations2 ops = new operations2();
        for (int i = 0; i < size; i++){
            int n = sc.nextInt();
            ops.insert(n);
        }
        ops.display();
    }
}
