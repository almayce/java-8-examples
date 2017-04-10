package defaultmethod;

/**
 * Created by almayce on 10.04.17.
 */
public interface DefaultMethodFromInterface {
    double calculate(int a);
    default double sqrtFromInterface(int a) {
        return Math.sqrt(a);
    }
}
