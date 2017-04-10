package referencesformethods;

/**
 * Created by almayce on 10.04.17.
 */
class TryThis {

    static class Something {
        String startsWith(String s) {
            return String.valueOf(s.charAt(0));
        }
    }

    public static void main(String[] args) {
        Something something = new Something();
        Converter<String, String> converter = something::startsWith;
        String converted = converter.convert("Alex");
        System.out.println(converted);
    }
}
