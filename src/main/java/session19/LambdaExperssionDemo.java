package session19;

public class LambdaExperssionDemo {

    public static void main(String[] args) {
        Hello hello = () -> System.out.println("Hello World"); //lambda expression
        hello.sayHello();

        HelloName helloName = name -> System.out.println("Hello " + name); //lambda expression with parameter
        helloName.sayHello("John");

        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println("Addition: " + addition.compute(10, 5));
        System.out.println("Subtraction: " + subtraction.compute(10, 5));
        System.out.println("Multiplication: " + multiplication.compute(10, 5));
        System.out.println("Division: " + division.compute(10, 5));

        TextFormatter upperCaseFormatter = text -> text.toUpperCase();
        TextFormatter lowerCaseFormatter = text -> text.toLowerCase();
        TextFormatter reverseFormatter = text -> new StringBuilder(text).reverse().toString();
        TextFormatter customFormatter = text -> "Formatted: " + text;

        System.out.println("Uppercase: " + upperCaseFormatter.format("hello"));
        System.out.println("Lowercase: " + lowerCaseFormatter.format("HELLO"));
        System.out.println("Reversed: " + reverseFormatter.format("hello"));

    }


}

@FunctionalInterface
interface Hello{
    void sayHello();
}
@FunctionalInterface
interface HelloName{
    void sayHello(String name);
}

@FunctionalInterface
interface MathOperation {
    int compute(int a, int b);
}
@FunctionalInterface
interface TextFormatter {
    String format(String text);
}