package Collections.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstRepeatingWord {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        Set<String> repSet = new HashSet<>();
        System.out.print("Enter any Sentence: ");
        String sentence = sc.nextLine();
        String[] sen = sentence.split(" ");
        for (String s : sen) {
            if (set.contains(s)){
                repSet.add(s);
            }
            else {
                set.add(s);
            }
        }
        if (repSet.isEmpty()) {
            System.out.println("No repeating words");
        } else {
            System.out.println(repSet);
        }
    }
}
