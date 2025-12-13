package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node4{
    int data;
    Node4 left;
    Node4 right;
    Node4(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class operations4{
    Node4 root = null;
    void insert(int[] arr){
        if (arr.length == 0 || arr[0] == -1){
            return;
        }
        Queue<Node4> q = new LinkedList<>();
        root = new Node4(arr[0]);
        q.add(root);

        int i = 1;
        while (i < arr.length && !q.isEmpty()){
            Node4 current = q.poll();

            if (arr[i] != -1){
                current.left = new Node4(arr[i]);
                q.add(current.left);
            }
            i++;

            if (arr[i] != -1){
                current.right = new Node4(arr[i]);
                q.add(current.right);
            }
            i++;
        }
    }

    void displayLevelOrder(){
        System.out.print("LevelOrder: ");
        if (root == null){
            System.out.print("The Tree is Empty");
            return;
        }
        Queue<Node4> displayQueue = new LinkedList<>();
        displayQueue.add(root);
        while (!displayQueue.isEmpty()){
            Node4 current = displayQueue.poll();
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

    void displayInOrder() {
        System.out.print("InOrder: ");
        if (root == null) {
            System.out.println("The Tree is Empty");
            return;
        }
        inorderRecursive(root);
        System.out.println();
    }

    void inorderRecursive(Node4 node) {
        if (node == null) {
            return;
        }

        inorderRecursive(node.left);   // Left
        System.out.print(node.data + " "); // Root
        inorderRecursive(node.right);  // Right
    }

}

public class InOrderTraversal {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Tree Size: ");
        int size = sc.nextInt();
        operations4 op4 = new operations4();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            int n = sc.nextInt();
            arr[i] = n;
        }
        op4.insert(arr);
        op4.displayLevelOrder();
        op4.displayInOrder();
    }
}
