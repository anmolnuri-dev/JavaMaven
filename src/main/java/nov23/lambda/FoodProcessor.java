package nov23.lambda;

@FunctionalInterface
public interface FoodProcessor<T,U> {
    U process(T t);
}
