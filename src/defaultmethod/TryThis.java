package defaultmethod;

/**
 * Created by almayce on 10.04.17.
 */
class TryThis implements DefaultMethodFromInterface {
    @Override
    public double calculate(int a) {
        return sqrtFromInterface(a);
    }

    class Formula {

    }

    void lambdasWithDefaultMethodFromInterface() {
//        error

//        Formula formula = (a) -> sqrtFromInterface( a * 100);
    }
}


