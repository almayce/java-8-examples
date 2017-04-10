package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by almayce on 10.04.17.
 */
class TryThis {
    List<String> names = Arrays.asList("peter", "anna", "john", "alex");

    private void method1() {
        Collections.sort(names, new Comparator<String>() {

            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
    }

    private void method2() {
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });
    }

    private void method3() {
        Collections.sort(names, (String a, String b) -> b.compareTo(a));
    }

    private void method4() {
        Collections.sort(names, (a,b) -> b.compareTo(a));
    }
}
