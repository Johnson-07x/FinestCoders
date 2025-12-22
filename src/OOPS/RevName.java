package OOPS;

import java.util.Scanner;

public class RevName {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Sentence: ");
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        int length = sb.length();
        int left = 0;
        int right = length - 1;
        while (left < right){
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
        System.out.println(sb.toString());

    }
}
