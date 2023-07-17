package Streams;

import java.util.stream.Stream;

public class IterateMethod {
    public static void main(String[] args) {
        Stream.iterate(1,n -> n + 1).limit(10)
                .forEach(s -> System.out.println(s));

        Stream.iterate(1,n -> n < 11, n -> n + 1).forEach(s -> System.out.println(s));
    }
}
