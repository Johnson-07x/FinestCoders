package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node2{
    int data;
    Node2 left;
    Node2 right;
    Node2(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class operation2{
    Node2 root = null;
    void insert(int[] arr){
        if (arr.length == 0 || arr[0] == -1){
            return;
        }

        Queue<Node2> q = new LinkedList<>();
        root = new Node2(arr[0]);
        q.add(root);

        int i = 1;
        while (i < arr.length && !q.isEmpty()){
            Node2 current = q.poll();

            if (arr[i] != -1){
                current.left = new Node2(arr[i]);
                q.add(current.left);
            }
            i++;

            if (i > arr.length && !q.isEmpty()){
                break;
            }

            if (arr[i] != -1){
                current.right = new Node2(arr[i]);
                q.add(current.right);
            }
            i++;
        }
    }

    void findOddAndEvenSum(){
        if (root == null){
            System.out.print("The Tree is Empty");
            return;
        }
        Queue<Node2> displayQueue = new LinkedList<>();
        displayQueue.add(root);
        int oddSum = 0;
        int evenSum = 0;
        while (!displayQueue.isEmpty()){
            Node2 current = displayQueue.poll();
//            System.out.print(current.data + " ");
            if (current.data % 2 == 0){
                evenSum += current.data;
            }
            if (current.data % 2 != 0){
                oddSum += current.data;
            }
            if (current.left != null){
                displayQueue.add(current.left);
            }
            if (current.right != null){
                displayQueue.add(current.right);
            }
        }
        System.out.println();
        System.out.println("Odd Sum: " + oddSum);
        System.out.println("Even Sum: " + evenSum);
    }
}

public class FindOddEven {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Tree Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        operation2 op2 = new operation2();
        for (int i = 0; i < size; i++){
            int n = sc.nextInt();
            arr[i] = n;
        }
        op2.insert(arr);
        op2.findOddAndEvenSum();
    }
}
