package PracticeProblems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node1 {
    int data;
    Node1 left, right = null;
    Node1(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class operations1 {
    Node1 root = null;
    void insert(int[] arr) {
        if (arr.length == 0 || arr[0] == -1) {
            System.out.print("Cannot create a Tree./");
            return;
        }
        Queue<Node1> q = new LinkedList<>();
        root = new Node1(arr[0]);
        q.add(root);

        int i = 1;
        while (i < arr.length && !q.isEmpty()) {
            Node1 curr = q.poll();
            if (arr[i] != -1) {
                curr.left = new Node1(arr[i]);
                q.add(curr.left);
            }
            i++;
            if (arr[i] != -1) {
                curr.right = new Node1(arr[i]);
                q.add(curr.right);
            }
            i++;
        }
    }

    void levelorder() {
        if (root == null) {
            return;
        }
        Queue<Node1> dq = new LinkedList<>();
        dq.add(root);
        while (!dq.isEmpty()) {
            Node1 curr = dq.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null) {
                dq.add(curr.left);
            }
            if (curr.right != null) {
                dq.add(curr.right);
            }
        }
        System.out.println();
    }

    void delete(int key) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (root.data == key) {
                root = null;
                return;
            }
        }
        Queue<Node1> q = new LinkedList<>();
        q.add(root);
        Node1 keyNode = null;
        Node1 lastNode = null;
        while (!q.isEmpty()) {
            lastNode = q.poll();
            if (lastNode.data == key) {
                keyNode = lastNode;
            }
            if (lastNode.left != null) {
                q.add(lastNode.left);
            }
            if (lastNode.right != null) {
                q.add(lastNode.right);
            }
        }
        if (keyNode == null) {
            System.out.println("Key is not found");
            return;
        }

        keyNode.data = lastNode.data;
        deleteLastNode(lastNode);
    }

    void deleteLastNode(Node1 lastNode) {
        Queue<Node1> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node1 curr = q.poll();
            if (curr.left != null) {
                if (curr.left == lastNode) {
                    curr.left = null;
                    return;
                }
                q.add(curr.left);
            }
            if (curr.right != null) {
                if (curr.right == lastNode) {
                    curr.right = null;
                    return;
                }
                q.add(curr.right);
            }
        }
    }

//    void preOrder() {
//        if (root == null) {
//            return;
//        }
//        displayPreorder(root);
//        System.out.println();
//    }
//
//    void displayPreorder(Node1 root) {
//        if (root == null) {
//            return;
//        }
//        System.out.print(root.data + " ");
//        displayPreorder(root.left);
//        displayPreorder(root.right);
//    }
}

public class BinaryTreeDeletion {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of Elements : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0 ; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        operations1 op1 = new operations1();
        op1.insert(arr);
        op1.levelorder();
        System.out.print("Enter value to delete: ");
        int key = sc.nextInt();
        op1.delete(key);
        op1.levelorder();
    }
}