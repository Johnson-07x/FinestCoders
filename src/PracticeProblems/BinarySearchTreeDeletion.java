package PracticeProblems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node2 {
    int data;
    Node2 left, right;

    Node2(int data) {
        this.data = data;
        left = right = null;
    }
}

class Operations2 {
    Node2 root = null;

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node2 insertRec(Node2 root, int data) {
        if (root == null) {
            return new Node2(data);
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node2 root) {
        if (root == null) return;
        inorderRec(root.left);
        System.out.print(root.data + " ");
        inorderRec(root.right);
    }

    void levelorder() {
        if (root == null) return;

        Queue<Node2> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node2 curr = q.poll();
            System.out.print(curr.data + " ");

            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
        System.out.println();
    }

    void delete(int key) {
        root = deleteRec(root, key);
    }

    Node2 deleteRec(Node2 root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = deleteRec(root.left, key);
        }
        else if (key > root.data) {
            root.right = deleteRec(root.right, key);
        }
        else {
            // if 1 or 0 child exists
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // if two child exists
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    int minValue(Node2 root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }
}

public class BinarySearchTreeDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations2 op2 = new Operations2();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            op2.insert(sc.nextInt());
        }

        System.out.print("Inorder (Sorted): ");
        op2.inorder();

        System.out.print("Level Order: ");
        op2.levelorder();

        System.out.print("Enter value to delete: ");
        int key = sc.nextInt();
        op2.delete(key);

        System.out.print("After Deletion (Inorder): ");
        op2.inorder();
    }
}

