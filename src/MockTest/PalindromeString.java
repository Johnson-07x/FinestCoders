package MockTest;

import java.util.ArrayList;

public class PalindromeString {
    static void main(String[] args) {
        String str = "ab#@!b41a";
        ArrayList<Character> a = new ArrayList<>();
        char[] arr = new char[0];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isAlphabetic(c)){
                arr[i] = c;
            }
        }

    }
}
