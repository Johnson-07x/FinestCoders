package MockTest;

import java.util.Scanner;

public class Test {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Sentence: ");
        String s = sc.nextLine();
        String[] arr= s.split(" ");
        for (String word : arr){
            if (word.length() >= 3){
                int length = word.length();
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(length - 1);
                String rem = word.substring(1, length - 1);
                word = lastChar + rem + firstChar;
                System.out.print(word + " ");
            }else {
                System.out.print(word + " ");
            }

        }
    }
}
