package Stack;

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
    Node top = null;
    void insert(int n){
        Node nn = new Node(n);
        if (top == null){
            top = nn;
        }else {
            nn.next = top;
            top = nn;
        }
    }

    void peek(){
        System.out.println(top.data);
    }

    void displayBottom(){
        Node temp = top;
        while (temp.next != null){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    void displayAll(){
        Node temp = top;
        while (temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}

public class Basics {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Stack Size: ");
        int size = sc.nextInt();
        operation op = new operation();
        for (int i = 0; i < size; i++){
            int n = sc.nextInt();
            op.insert(n);
        }
        op.peek();
        op.displayBottom();
        op.displayAll();
    }
}
