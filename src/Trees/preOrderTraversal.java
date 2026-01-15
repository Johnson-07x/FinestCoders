package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node5{
    int data;
    Node5 left;
    Node5 right;
    Node5(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class operations5{
    Node5 root;
    void insert(int[] arr){
        if (arr.length == 0 || arr[0] == -1 ){
            System.out.print("Tree is Not Created");
            return;
        }

        Queue<Node5> q = new LinkedList<>();
        root = new Node5(arr[0]);
        q.add(root);

        int i = 1;
        while (i < arr.length && !q.isEmpty()){
            Node5 current = q.poll();
            if (arr[i] != -1){
                current.left = new Node5(arr[i]);
                q.add(current.left);
            }
            i++;

            if (i >= arr.length || q.isEmpty()){
                return;
            }

            if (arr[i] != -1){
                current.right = new Node5(arr[i]);
                q.add(current.right);
            }
            i++;
        }
    }

    void displayLevelorder(){
        if (root == null){
            System.out.print("The Tree is Empty");
            return;
        }
        System.out.print("LevelOrder: ");
        Queue<Node5> displayQueue = new LinkedList<>();
        displayQueue.add(root);
        while (!displayQueue.isEmpty()){
            Node5 current = displayQueue.poll();
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

    void displayPreorder(){
        System.out.print("Preorder: ");
        if (root == null){
            return;
        }
        preorderRecursive(root);
        System.out.println();
    }

    void preorderRecursive(Node5 node){
        if (node == null){
            return;
        }
        System.out.print(node.data + " ");
        preorderRecursive(node.left);
        preorderRecursive(node.right);
    }
}

public class preOrderTraversal {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Tree size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        operations5 op5 = new operations5();
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        op5.insert(arr);
        op5.displayLevelorder();
        op5.displayPreorder();
    }
}
