package function;

import java.util.function.Function;

/**
 * Created by almayce on 10.04.17.
 */
class TryThis {
    public static void main(String[] args) {
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        backToString.apply("123");
    }
}
