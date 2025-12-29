package Java8;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface sq {
    public void square(int n);
}

public class Method {
    static void main(String[] args) {
        sq x = (n) -> {
            int sq = n * n;
            System.out.println(sq);
        };
        x.square(10);

        Predicate<Integer> y = (n) -> n % 2 == 0;
        System.out.println(y.test(10));

        Consumer<String> c = (s) -> System.out.println("Hi " + s);
        c.accept("Johnson");

        Supplier<Integer> s = () -> new Random().nextInt(100);
        System.out.println(s.get());

        Function<Integer, Integer> f = (n) -> n * n;
        System.out.println(f.apply(7));
    }
}
