package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s2.add(3);
        s2.add(4);
        s2.add(5);
        s2.add(6);
        s2.add(7);
        Set<Integer> union = new HashSet<>(s);
        union.addAll(s2);
        System.out.println(union);
        Set<Integer> intersection = new HashSet<>(s);
        intersection.retainAll(s2);
        System.out.println(intersection);
        Set<Integer> diff = new HashSet<>(s);
        diff.removeAll(s2);
        System.out.println(diff);
    }
}
