package functionalinterface;

/**
 * Created by almayce on 10.04.17.
 */
class TryThis {

    @FunctionalInterface
    interface Converter<F, T> {
        T convert(F from);
    }

    private static void method1() {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("777");
        System.out.println(converted);
    }

    private static void method2() {
        Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("777");
        System.out.println(converted);
    }

    public static void main(String[] args) {
        method1();
        method2();
    }
}
