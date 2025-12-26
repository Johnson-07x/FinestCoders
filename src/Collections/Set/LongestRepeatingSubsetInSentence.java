package Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestRepeatingSubsetInSentence {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new LinkedHashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        System.out.print("Enter any Sentence: ");
        String sentence = sc.nextLine();
        String[] sen = sentence.split(" ");
        int wordCount = 0;
        for (String s : sen) {
            set2.add(s);
            wordCount++;
            if (set.contains(s)) {
                set2.remove(s);
            }else {

            }
        }
    }
}
