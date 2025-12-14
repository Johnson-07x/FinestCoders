package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node6{
    int data;
    Node6 left;
    Node6 right;
    Node6(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class operations6{
    Node6 root;
    void insert(int[] arr){
        if (arr.length == 0 || arr[0] == -1){
            return;
        }
        root = new Node6(arr[0]);
        Queue<Node6> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (i < arr.length && !q.isEmpty()){
            Node6 current = q.poll();
            if (arr[i] != -1){
                current.left = new Node6(arr[i]);
                q.add(current.left);
            }
            i++;

            if (i >= arr.length || q.isEmpty()){
                return;
            }

            if (arr[i] != -1){
                current.right = new Node6(arr[i]);
                q.add(current.right);
            }
            i++;
        }
    }

    void displayPostorder(){
        if (root == null){
            return;
        }
        postorderRecursive(root);
        System.out.println();
    }

    void postorderRecursive(Node6 node){
        if (node == null){
            return;
        }
        postorderRecursive(node.left);
        postorderRecursive(node.right);
        System.out.print(node.data + " ");
    }
}

public class postorderTraversal {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Tree size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        operations6 op6 = new operations6();
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        op6.insert(arr);
        op6.displayPostorder();
    }
}
