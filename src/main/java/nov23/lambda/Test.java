package nov23.lambda;

import jdk.nashorn.internal.objects.annotations.Function;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Eat e1 = ()-> "Eating a burger";
        System.out.println(e1.eat());
        IGame game = (a,b)->Math.random()>0.5?a:b;

        List<String> faang = Arrays.asList("Meta", "Amazon", "Netflix", "Google","Apple");
        System.out.println(faang);
        //faang.sort();
        //faang.removeIf();


    }
}

@FunctionalInterface
interface IGame{
    String play(String A, String B);
    default void noShow(){
        System.out.println("No Game");
    }
}




