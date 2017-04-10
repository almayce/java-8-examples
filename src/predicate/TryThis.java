package predicate;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Created by almayce on 10.04.17.
 */
class TryThis {
    Predicate<String> predicate = (s) -> s.length() > 0;

    void predicateTest() {
        System.out.println(predicate.test("foo"));
        System.out.println(predicate.test("f"));
        System.out.println(predicate.negate().test("f"));
    }

    Predicate<Boolean> nonNull = Objects::nonNull;
    Predicate<Boolean> isNull = Objects::isNull;

    Predicate<String> isEmpty = String::isEmpty;
    Predicate<String> isNotEmpty = isEmpty.negate();

    static class Runner {
        public static void main(String[] args) {
            new TryThis().predicateTest();
        }
    }
}
