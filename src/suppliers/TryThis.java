package suppliers;

import java.util.function.Supplier;

/**
 * Created by almayce on 10.04.17.
 */
class TryThis {
    public static void main(String[] args) {
        Supplier<Person> personSupplier = Person::new;
        personSupplier.get();
    }

    static class Person {
//        Person() {
//        }
    }
}
