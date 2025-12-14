package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node8{
    int data;
    Node8 left;
    Node8 right;
    Node8(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class operations8{
    Node8 root;
    void insert(int[] arr){
        if (arr.length == 0 || arr[0] == -1){
            System.out.print("The Tree is Invalid");
            return;
        }
        root = new Node8(arr[0]);
        Queue<Node8> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (i < arr.length && !q.isEmpty()){
            Node8 current = q.poll();
            if (arr[i] != -1){
                current.left = new Node8(arr[i]);
                q.add(current.left);
            }
            i++;

            if (i >= arr.length || q.isEmpty()){
                return;
            }

            if (arr[i] != -1){
                current.right = new Node8(arr[i]);
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
        Node8 current = root;
        Queue<Node8> q = new LinkedList<>();
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


}

public class FindDepthAndHeight {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Tree size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        operations8 op8 = new operations8();
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        op8.insert(arr);
        op8.LevelOrder();
//        op8.find();
    }
}
