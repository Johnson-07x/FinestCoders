package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class operations{
    Node root = null;
    void insert(int[] arr){
        if (arr.length == 0 || arr[0] == -1){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        root = new Node(arr[0]);
        q.add(root);

        int i = 1;
        while (i < arr.length && !q.isEmpty()){
            Node current = q.poll();

            if (arr[i] != -1){
                current.left = new Node(arr[i]);
                q.add(current.left);
            }
            i++;

            if (arr[i] != -1){
                current.right = new Node(arr[i]);
                q.add(current.right);
            }
            i++;
        }
    }

    void displayLevelOrder(){
        if (root == null){
            System.out.print("The Tree is Empty");
            return;
        }
        Queue<Node> displayQueue = new LinkedList<>();
        displayQueue.add(root);
        while (!displayQueue.isEmpty()){
            Node current = displayQueue.poll();
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

//    void displayInOrder(){
//        if (root == null){
//            System.out.print("The Tree is Empty");
//            return;
//        }
//        Queue<Node> displayQueue = new LinkedList<>();
//        displayQueue.add(root);
//        while (!displayQueue.isEmpty()){
//            Node current = displayQueue.poll();
//            while (current.left != null){
//                current.left = current;
//                current = current.left;
//            }
//            System.out.print(current.data + " ");
//        }
//    }
}

public class BinaryTree {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Tree Size: ");
        int size = sc.nextInt();
        operations op = new operations();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            int n = sc.nextInt();
            arr[i] = n;
        }
        op.insert(arr);
        op.displayLevelOrder();
    }
}
