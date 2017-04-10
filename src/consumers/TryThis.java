package consumers;

import java.util.function.Consumer;

/**
 * Created by almayce on 10.04.17.
 */
public class TryThis {
    public static void main(String[] args) {
        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
        greeter.accept(new Person("Alex", "Kolch"));
    }

    static class Person {
        private String firstName;
        private String secondName;

        public Person(String firstName, String secondName) {
            this.firstName = firstName;
            this.secondName = secondName;
        }
    }
}
