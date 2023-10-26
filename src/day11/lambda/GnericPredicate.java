package day11.lambda;
@FunctionalInterface
public interface GnericPredicate<T> {
    boolean test(T t);
}
