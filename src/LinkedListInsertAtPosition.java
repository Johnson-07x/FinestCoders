import java.util.Scanner;

class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data = data;
        this.next = null;
    }
}

class operations3{
    Node3 head = null;
    Node3 tail = null;
    void insert(int n){
        Node3 n3 = new Node3(n);
        if (head == null){
            head = n3;
            tail = n3;
        }else {
            tail.next = n3;
            tail = n3;
        }
    }

    void insertAtPosition(int position, int newNum){
        Node3 current = head;
        for (int i = 1; i < position - 1; i++){
            current = current.next;
        }
        Node3 n3 = new Node3(newNum);
        n3.next = current.next;
        current.next = n3;
    }

    void deleteAtPosition(int position){
        Node3 current = head;
        for (int i = 1; i < position - 1; i++){
            current = current.next;
        }
        current.next = current.next.next;
    }

    void display(){
        Node3 current = head;
        while (current != null){
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}

public class LinkedListInsertAtPosition {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the LinkedList Size: ");
        int size = sc.nextInt();
        operations3 op3 = new operations3();
        for (int i = 0; i < size; i++){
            int num = sc.nextInt();
            op3.insert(num);
        }
        System.out.print("Enter Number to Add: ");
        int newNum = sc.nextInt();
        System.out.print("Enter the Position to Add: ");
        int position = sc.nextInt();
        op3.insertAtPosition(position, newNum);
        op3.display();
        System.out.print("Enter the Position which you want to delete: ");
        position = sc.nextInt();
        op3.deleteAtPosition(position);
        op3.display();
    }
}
