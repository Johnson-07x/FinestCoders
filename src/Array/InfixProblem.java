package Array;

import java.util.Scanner;

class operation{
    void push(int n){

    }

    void pop(){

    }

    void display(){

    }

    void check(){

    }
}

public class InfixProblem {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Stack Size: ");
        int size = sc.nextInt();
        char[] arr = new char[size];
        operation op = new operation();
        System.out.print("Enter the Expression in Order: ");
        String s = sc.nextLine();
        for (int i = 0; i < size; i++){
            arr[i] = s.charAt(i);
        }
        for (int i = 0; i < size; i++){
            System.out.print(arr[i]);
        }
    }
}
