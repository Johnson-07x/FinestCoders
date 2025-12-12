package Stack;

import java.util.Scanner;

class Node3{
    char data;
    Node3 next;
    Node3(char data){
        this.data = data;
        this.next = null;
    }
}

class operation3{
    Node3 top = null;
    void push(char c){
        Node3 nn = new Node3(c);
        if (top == null){
            top = nn;
        }else {
            nn.next = top;
            top = nn;
        }
    }

    void pop(char c){
        switch (c){
            case '}':
                if (top.data == '{'){
                    top = top.next;
                }else {
                    System.out.print("Invalid");
                    break;
                }
                break;
            case ']':
                if (top.data == '['){
                    top = top.next;
                }else {
                    System.out.print("Invalid");
                    break;
                }
                break;
            case ')':
                if (top.data == '('){
                    top = top.next;
                }else {
                    System.out.print("Invalid");
                    break;
                }
                break;
            default:
                System.out.print("Invalid Bracket");
        }
    }

    void display(){
        Node3 temp = top;
        if (top == null){
            System.out.print("The Given Order is Valid");
        }else {
            while (temp != null){
                System.out.print(temp.data);
                temp = temp.next;
            }
            System.out.println();
        }

    }
}

public class CheckAllBracketAreClosedProperly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter All the Braces to check: ");
        String brackets = sc.nextLine();
        operation3 op3 = new operation3();
        for (int i = 0; i < brackets.length(); i++){
            char c = brackets.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                op3.push(c);
            }else {
                op3.pop(c);
            }
        }
        op3.display();
    }
}
