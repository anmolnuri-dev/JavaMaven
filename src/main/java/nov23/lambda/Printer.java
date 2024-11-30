package nov23.lambda;

@FunctionalInterface
public interface Printer<T> {
    void print(T item);
}
