# Functional Interfaces in Java 8
## Overview
### Java 8 introduced several functional interfaces in the java.util.function package. These interfaces are the building blocks of functional programming in Java and serve as the foundation for creating custom lambda expressions. They allow you to represent single-method functionality in a concise, functional programming style.

# Why Use Functional Interfaces for Lambdas?
## Simplified Syntax: 
### Lambdas are shorthand representations of anonymous inner classes implementing functional interfaces. Using them makes the code cleaner and less verbose.

## Reusable Code
### With functional interfaces like Predicate, Function, and Consumer, you can write general-purpose lambda expressions that can be reused across different parts of your code.

## Stream API
### Functional interfaces are extensively used in the Stream API (e.g., filter(), map(), forEach()) to enable declarative programming for collections.

## Custom Logic
### You can define specific logic by creating your own lambdas for tasks such as filtering, mapping, or transforming data.

# Functional Interfaces and Examples

## 1. Predicate
Purpose: Represents a condition (boolean-valued function) that tests an input.
Functional Method: _boolean test(T t)_
Example: Filtering elements in a collection.

      import java.util.function.Predicate;
      import java.util.Arrays;
      import java.util.List;
      
      public class PredicateExample {
      public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
      
              // Lambda implementing Predicate
              Predicate<Integer> isEven = n -> n % 2 == 0;
      
              // Using the Predicate in a Stream API
              numbers.stream()
                     .filter(isEven)
                     .forEach(System.out::println); // Output: 2, 4, 6
          }
      }



## 2.Consumer
   Purpose: Represents an operation that takes a single input but does not return a result.
   Functional Method: _void accept(T t)_
   Example: Performing actions like printing or modifying elements.
      
      import java.util.function.Consumer;
      import java.util.Arrays;
      import java.util.List;
      
      public class ConsumerExample {
      public static void main(String[] args) {
      List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
      
              // Lambda implementing Consumer
              Consumer<String> greet = name -> System.out.println("Hello, " + name);
      
              // Using Consumer in forEach
              names.forEach(greet);
              // Output:
              // Hello, Alice
              // Hello, Bob
              // Hello, Charlie
          }
      }


## 3.Supplier
   Purpose: Represents a function that takes no arguments but produces a result.

Functional Method: T get()

Use Case: Generating or supplying data on demand.

Example:

    import java.util.function.Supplier; 
    public class SupplierExample { 
        public static void main(String[] args) {
            Supplier<String> supplier = () -> "Hello, Java 8!";
            System.out.println(supplier.get()); // Output: Hello, Java 8!
        }
    }

## 4. Function
   Purpose: Represents a function that takes one argument and produces a result.

Functional Method: _R apply(T t)_

Use Case: Transforming data.

Example:

    import java.util.function.Function;
    public class FunctionExample { 
        public static void main(String[] args) {
        Function<String, Integer> lengthFunction = str -> str.length();
        System.out.println(lengthFunction.apply("Java")); // Output: 4
        }
    }

## 5. BiPredicate
   Purpose: Similar to Predicate, but accepts two arguments.

Functional Method: _boolean test(T t, U u)_

Use Case: Comparing or testing relationships between two inputs.

Example:

    import java.util.function.BiPredicate;

        public class BiPredicateExample {
            public static void main(String[] args) {
            BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
            System.out.println(isGreater.test(10, 5)); // true
            System.out.println(isGreater.test(3, 5));  // false
        }
    }

## 6. BiConsumer
   Purpose: Similar to Consumer, but accepts two arguments.

Functional Method: _void accept(T t, U u)_

Use Case: Performing actions that involve two inputs.

Example:

    import java.util.function.BiConsumer;

    public class BiConsumerExample {
        public static void main(String[] args) {

            BiConsumer<String, Integer> printPerson = (name, age) ->
            System.out.println(name + " is " + age + " years old."); 
            printPerson.accept("John", 25); // Output: John is 25 years old.
        }
    }

## 7. BiFunction
   Purpose: Similar to Function, but accepts two arguments and produces a result.

Functional Method: _R apply(T t, U u)_

Use Case: Combining or processing two inputs to generate a result.

Example:

    import java.util.function.BiFunction;

    public class BiFunctionExample {
        public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(10, 20)); // Output: 30
        }
    }

## 8. UnaryOperator
   Purpose: A specialization of Function for a single input type, where input and output types are the same.

Functional Method: _T apply(T t)_

Use Case: Transforming an object of one type into another of the same type.

Example:

    import java.util.function.UnaryOperator;
    public class UnaryOperatorExample {
        public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5)); // Output: 25
        }
    }

## 9. BinaryOperator
   Purpose: A specialization of BiFunction for two arguments of the same type and produces a result of the same type.

Functional Method: _T apply(T t1, T t2)_

Use Case: Operations like addition, multiplication, or finding maximum values.

Example:

    import java.util.function.BinaryOperator;
    public class BinaryOperatorExample {
        public static void main(String[] args) {
        BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;
        System.out.println(max.apply(10, 20)); // Output: 20
        }
    }

## 10. Runnable
Purpose: A functional interface with no arguments or return value, typically used for multithreading.
Functional Method: void run()

Example:

    public class RunnableExample {
        public static void main(String[] args) {
        Runnable task = () -> System.out.println("Task is running.");
        new Thread(task).start(); // Output: Task is running.
        }
    }

**Summary Table**
**Interface**               **Purpose**                                                  **Functional Method**
Predicate<T>	        Tests a condition on an input.	                         boolean test(T t)
Consumer<T>	            Performs an action on an input.	                         void accept(T t)
Supplier<T>	            Supplies a result without input.	                     T get()
Function<T, R>	        Transforms input to output.	                             R apply(T t)
BiPredicate<T, U>	    Tests a condition on two inputs.	                     boolean test(T t, U u)
BiConsumer<T, U>	    Performs an action on two inputs.	                     void accept(T t, U u)
BiFunction<T, U, R>	    Transforms two inputs to a result.	                     R apply(T t, U u)
UnaryOperator<T>	    Transforms input to output of the same type.	         T apply(T t)
BinaryOperator<T>	    Combines two inputs into one result of the same type.	 T apply(T t1, T t2)
Runnable	            Represents a task to be executed.	                     void run()
