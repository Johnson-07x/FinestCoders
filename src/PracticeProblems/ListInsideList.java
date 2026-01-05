package PracticeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListInsideList {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<String>> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add(new ArrayList<>());
            System.out.print("Enter any String: ");
            String s = sc.nextLine();
            l.get(i).add(s);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(l.get(i));
        }
    }
}

//to be continued...
