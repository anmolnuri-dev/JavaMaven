package nov30.methodref;

@FunctionalInterface
interface BiConsumer{
    void consume (String a, String b);
}


public class PrintTwo {
    public void printTwoName(String name1, String name2) {
        System.out.println("name1 " + name1);
        System.out.println("name2 " + name2);
    }
}
