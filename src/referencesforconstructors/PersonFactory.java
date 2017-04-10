package referencesforconstructors;

/**
 * Created by almayce on 10.04.17.
 */
public interface PersonFactory <P extends Person> {
    P create(String firstName, String lastName);
}
