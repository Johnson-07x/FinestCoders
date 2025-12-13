package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node3{
    int data;
    Node3 left;
    Node3 right;
    Node3(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class operations3{
    Node3 root = null;
    void insert(int[] arr){
        if (arr.length == 0 || arr[0] == -1){
            return;
        }

        root = new Node3(arr[0]);
        Queue<Node3> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (i < arr.length && !q.isEmpty()){
            Node3 current = q.poll();
            if (arr[i] != -1){
                current.left = new Node3(arr[i]);
                q.add(current.left);
            }
            i++;

            if (i > arr.length && !q.isEmpty()){
                break;
            }

            if (arr[i] != -1){
                current.right = new Node3(arr[i]);
                q.add(current.right);
            }
            i++;
        }
    }

    void display(){
        if (root == null){
            System.out.print("The Tree is Empty");
            return;
        }
        Queue<Node3> displayQueue = new LinkedList<>();
        displayQueue.add(root);

        while (!displayQueue.isEmpty()){
            Node3 current = displayQueue.poll();
            System.out.print(current.data + " ");
            if (current.left != null){
                displayQueue.add(current.left);
            }
            if (current.right != null){
                displayQueue.add(current.right);
            }
        }
        System.out.println();
    }

    void sumOfLeaf(){
        int LeafSum = 0;
        if (root == null){
            System.out.print("The Tree is Empty");
            return;
        }
        Queue<Node3> displayQueue = new LinkedList<>();
        displayQueue.add(root);

        while (!displayQueue.isEmpty()){
            Node3 current = displayQueue.poll();
            //System.out.print(current.data + " ");
            if (current.left != null){
                displayQueue.add(current.left);
            }
            if (current.right != null){
                displayQueue.add(current.right);
            }
            if (current.left == null && current.right == null){
                LeafSum += current.data;
            }
        }
        System.out.print(LeafSum);
    }
}

public class SumOfLeafNodes {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Tree size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        operations3 op3 = new operations3();
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        op3.insert(arr);
        op3.display();
        op3.sumOfLeaf();
    }
}
