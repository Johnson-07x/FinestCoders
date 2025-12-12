package LinkedList;

import java.util.Scanner;

class Node4{
    int data;
    Node4 next;
    Node4(int data){
        this.data = data;
        this.next = null;
    }
}

class operations4{
    Node4 head = null;
    Node4 tail = null;
    void insert(int n){
        Node4 n4 = new Node4(n);
        if (head == null){
            head = n4;
            tail = n4;
        }else {
            tail.next = n4;
            tail = n4;
        }
    }

    void deleteAtPosition(){

    }

    void deleteFromTheFirst(){

    }

    void deleteFromTheEnd(int delCount){
        Node4 current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }

    void display(){
        Node4 current = head;
        if (head == null){
            System.out.print("List is Empty");
        }else {
            while (current != null){
                System.out.print(current.data);
                if (current.next != null){
                    System.out.print(" -> ");
                }
                current = current.next;
            }
            System.out.println();
        }
    }
}

public class DeletionOfNode {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of LinkedList: ");
        int size = sc.nextInt();
        operations4 op4 = new operations4();
        System.out.print("Enter the Elements: ");
        for (int i = 0; i < size; i++){
            int n = sc.nextInt();
            op4.insert(n);
        }
        op4.display();
        System.out.print("Enter the Number of Node to be Deleted from the End: ");
        int delCountFromEnd = sc.nextInt();
        for (int i = 0; i < delCountFromEnd; i++){
            op4.deleteFromTheEnd(delCountFromEnd);
        }
        op4.display();
//        System.out.print("Enter the Number of Node to be Deleted from the Start: ");
//        int delCountFromStart = sc.nextInt();
//        op4.deleteFromTheEnd(delCountFromStart);
//        op4.display();
    }
}
