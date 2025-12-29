package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Task1 {
    static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        Supplier<Integer> s = () -> new Random().nextInt(100);
        l.add(s.get());
        l.add(s.get());
        l.add(s.get());
        l.add(s.get());
        l.add(s.get());
        System.out.println(l);
        Predicate<Integer> p = (m) -> m >= 50;
        Function<Integer, String> f = (m) -> m >= 50 ? "Pass" : "Fail";
        Function<Integer, String> f2 = (m) -> m > 80 ? "A" : m > 70 ? "B" : m >= 50 ? "C" : "F";
//        Consumer<String> c = () -> System.out.println();
        int studentId = 730701;
        for (int e : l) {
            System.out.print("Student ID: " + studentId + " ");
            System.out.print("Student Mark: " + e + " ");
            System.out.print("Status: " + f.apply(e) + " ");
            System.out.print("Grade: " + f2.apply(e) + " ");
            System.out.println();
            studentId++;
        }
    }
}
