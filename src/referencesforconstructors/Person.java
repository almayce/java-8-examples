package referencesforconstructors;

/**
 * Created by almayce on 10.04.17.
 */
class Person {
    String firstName;
    String lastName;

    Person() {}

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Person(String firstName) {
        this.firstName = firstName;
    }
}
