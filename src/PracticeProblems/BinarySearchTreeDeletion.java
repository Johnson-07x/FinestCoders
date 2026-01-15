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
        Node2 n2 = new Node2(data);

        if (root == null) {
            root = n2;
            return;
        }

        Node2 curr = root;
        Node2 parent = null;

        while (curr != null) {
            parent = curr;
            if (data < curr.data)
                curr = curr.left;
            else
                curr = curr.right;
        }

        if (data < parent.data)
            parent.left = n2;
        else
            parent.right = n2;
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
        Node2 curr = root;
        Node2 parent = null;

        // finding the node
        while (curr != null && curr.data != key) {
            parent = curr;
            if (key < curr.data)
                curr = curr.left;
            else
                curr = curr.right;
        }

        // edge case handled
        if (curr == null) {
            System.out.println("Key not found");
            return;
        }

        // node with two children
        if (curr.left != null && curr.right != null) {
            Node2 succParent = curr;
            Node2 succ = curr.right;

            while (succ.left != null) {
                succParent = succ;
                succ = succ.left;
            }

            curr.data = succ.data;
            curr = succ;
            parent = succParent;
        }

        // node with 0 or 1 child
        Node2 child = (curr.left != null) ? curr.left : curr.right;

        if (parent == null)
            root = child;
        else if (parent.left == curr)
            parent.left = child;
        else
            parent.right = child;
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

