import java.util.Scanner;

class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data = data;
        this.next = null;
    }
}

class operations{
    Node2 head = null;
    Node2 tail = null;
    void insert(int n){
        Node2 newNode = new Node2(n);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
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

public class LinkedListInsertAtBegining {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the LinkedList Size: ");
        int size = sc.nextInt();
        operations ops = new operations();
        for (int i = 0; i < size; i++){
            int n = sc.nextInt();
            ops.insert(n);
        }
        ops.display();
    }
}
