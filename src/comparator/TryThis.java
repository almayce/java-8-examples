package comparator;

import java.util.Comparator;

/**
 * Created by almayce on 10.04.17.
 */
class TryThis {
    public static void main(String[] args) {
        Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);

        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Alice", "Wonderland");

        System.out.println(comparator.compare(p1, p2));             // > 0
        System.out.println(comparator.reversed().compare(p1, p2));  // < 0
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
