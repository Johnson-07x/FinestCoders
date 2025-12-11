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
    void display(){
        Node curr = head;

        while (curr != null){
            System.out.print(curr.data);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }

        System.out.println();
    }
}

public class LinkedList {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Linked List Size:");
        int size = sc.nextInt();
        operation op = new operation();
        for (int i = 0; i < size; i++){
            int n = sc.nextInt();
            op.insert(n);
        }
        op.display();
    }
}
