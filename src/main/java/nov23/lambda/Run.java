package nov23.lambda;

public class Run {
    public static void main(String[] args) {
        Printer<String> pr = n-> System.out.println(n);
        pr.print("Hello World");

        FoodProcessor<String, Double> p = n-> Double.parseDouble(n);
        System.out.println(p.process("123.45"));

    }
}
