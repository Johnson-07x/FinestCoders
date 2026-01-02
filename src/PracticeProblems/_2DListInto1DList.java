package PracticeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _2DListInto1DList {
    static void main(String[] args) {
        List<List<Integer>> l = List.of(List.of(1,2,13),List.of(1,12,3),List.of(11,2,3));
        int result = l.stream()
                        .flatMap(n -> n.stream())
                .filter(n -> n > 10)
                        .mapToInt(Integer::intValue)
//                .reduce(0, (a,b) -> a+b)
                                .sum();
        System.out.println(result);
    }
}
