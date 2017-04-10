package variablesaccess;

import referencesformethods.Converter;

/**
 * Created by almayce on 10.04.17.
 */
class TryThis {
    static int outerStaticNum;
    int outerNum;

    void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            System.out.println(outerNum);
            return String.valueOf(from);
        };

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            System.out.println(outerStaticNum);
            return String.valueOf(from);
        };

        stringConverter1.convert(24);
        stringConverter2.convert(73);
    }

    public static void main(String[] args) {
        new TryThis().testScopes();
    }
}
