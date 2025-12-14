package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node7{
    int data;
    Node7 left;
    Node7 right;
    Node7(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class operations7{
    Node7 root;
    void insert(int[] arr){
        if (arr.length == 0 || arr[0] == -1){
            System.out.print("The Tree is Invalid");
            return;
        }
        root = new Node7(arr[0]);
        Queue<Node7> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (i < arr.length && !q.isEmpty()){
            Node7 current = q.poll();
            if (arr[i] != -1){
                current.left = new Node7(arr[i]);
                q.add(current.left);
            }
            i++;

            if (i >= arr.length || q.isEmpty()){
                return;
            }

            if (arr[i] != -1){
                current.right = new Node7(arr[i]);
                q.add(current.right);
            }
            i++;
        }
    }

    void LevelOrder(){
        if (root == null){
            System.out.print("The Tree is Empty");
            return;
        }
        System.out.print("LevelOrder: ");
        Node7 current = root;
        Queue<Node7> q = new LinkedList<>();
        q.add(current);

        while (!q.isEmpty()){
            current = q.poll();
            System.out.print(current.data + " ");
            if (current.left != null){
                q.add(current.left);
            }
            if (current.right != null){
                q.add(current.right);
            }
        }
        System.out.println();
    }

    void inorder(){
        if (root == null){
            return;
        }
        System.out.print("Inorder: ");
        inorderRecursion(root);
        System.out.println();
    }

    void inorderRecursion(Node7 node){
        if (node == null){
            return;
        }
        inorderRecursion(node.left);
        System.out.print(node.data + " ");
        inorderRecursion(node.right);
    }

    void preorder(){
        System.out.print("PreOrder: ");
        if (root == null){
            return;
        }
        preorderRecursion(root);
        System.out.println();
    }

    void preorderRecursion(Node7 node){
        if (node == null){
            return;
        }
        System.out.print(node.data + " ");
        preorderRecursion(node.left);
        preorderRecursion(node.right);
    }

    void postorder(){
        System.out.print("PostOrder: ");
        if (root == null){
            return;
        }
        postorderRecursion(root);
        System.out.println();
    }

    void postorderRecursion(Node7 node){
        if (node == null){
            return;
        }
        postorderRecursion(node.left);
        postorderRecursion(node.right);
        System.out.print(node.data + " ");
    }
}

public class AllTypesOfTraversal {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Tree size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        operations7 op7 = new operations7();
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        op7.insert(arr);
        op7.LevelOrder();
        op7.inorder();
        op7.preorder();
        op7.postorder();
    }
}
