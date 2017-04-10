package referencesformethods;

/**
 * Created by almayce on 10.04.17.
 */
public interface Converter<F, T> {
    T convert(F from);
}
