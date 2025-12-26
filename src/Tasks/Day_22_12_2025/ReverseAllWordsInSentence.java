package Tasks.Day_22_12_2025;

import java.util.Scanner;

public class ReverseAllWordsInSentence {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Sentence: ");
        String sentence = sc.nextLine();
        StringBuilder sb = new StringBuilder(sentence);
        int length = sb.length();
        System.out.println(length);
        String[] sen = sentence.split(" ");
        for (String s : sen) {
            System.out.print(s);
        }
    }
}
