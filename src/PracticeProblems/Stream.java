package PracticeProblems;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    static void main(String[] args) {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7);
        l.stream()
                .filter(n -> (n&1) == 1)
                .forEach(System.out::println);
        List<Integer> ans = l.stream()
                .skip(2)
                .limit(3)
                .map(n -> n * 10)
                .collect(Collectors.toList());
        System.out.println(l);
        System.out.println(ans);
        long count = l.stream()
                .filter(n -> (n&1) == 1)
                .count();
        System.out.println(count    );
    }
}
