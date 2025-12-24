package OOPS.Practice;

import java.util.Scanner;

class Node3 {
    int data;
    Node3 next;
    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

class operations3 {
    Node3 top = null;
    void insert(int t) {
        Node3 n3 = new Node3(t);
        if (top == null) {
            top = n3;
        }else {
            n3.next = top;
            top = n3;
        }
    }

    void calculate() {
        Node3 curr = top;
        int[] arr;
        while (curr != null) {

        }
    }

    void display() {
        Node3 curr = top;
        while (curr != null) {
            System.out.print(curr.data);
            curr = curr.next;
        }
    }
}

public class WeatherForecast {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of Elements: ");
        int size = sc.nextInt();
        operations3 op3 = new operations3();
        for (int i = 0; i < size; i++) {
            int t = sc.nextInt();
            op3.insert(t);
        }
        op3.display();
    }
}
