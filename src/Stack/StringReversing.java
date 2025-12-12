package Stack;

import java.util.Scanner;

class Node2{
    char data;
    Node2 next;
    Node2(char data){
        this.data = data;
        this.next = null;
    }
}

class operation2{
    Node2 top = null;
    void insert(char n){
        Node2 nn = new Node2(n);
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
        Node2 temp = top;
        while (temp.next != null){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    void displayAll(){
        Node2 temp = top;
        while (temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}

public class StringReversing {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String content = sc.nextLine();
        operation2 op2 = new operation2();
        for (int i = 0; i < content.length(); i++){
            char c = content.charAt(i);
            op2.insert(c);
        }
//        op2.peek();
//        op2.displayBottom();
        op2.displayAll();
//        char c = content.charAt(1);
//        System.out.print(c);
    }
}
