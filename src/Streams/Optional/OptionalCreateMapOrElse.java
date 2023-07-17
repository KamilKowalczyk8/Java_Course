package Streams.Optional;

import java.util.Optional;

public class OptionalCreateMapOrElse {
    public static void main(String[] args) {
        Optional<Integer> opt = Optional.ofNullable(Integer.valueOf(20));
        Optional<Integer> opt2 = opt.map(i -> i * 3);
        System.out.println(opt2);

        Optional<Integer> opt3 = Optional.ofNullable(20);
        Optional<Integer> opt4 = opt3.map(i -> i * 3);
        System.out.println(opt4.orElse(20));

        Integer int2 = Integer.valueOf(100);
        //int2 = null;
        Optional<Integer> optInt = Optional.ofNullable(int2);

        optInt.map(i -> i*2)
                .map(i -> i +50)
                .map(i->i/2)
                .ifPresent(System.out::println);

    }
}
