package session19;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StandardInterfacesDemo {
    public static void main(String[] args) {

        Runnable sayHello = () -> System.out.println("Hello from Runnable!"); // no input, no output, simply runs
        sayHello.run();

        Consumer<String> printMessage = message -> System.out.println("Message: " + message); // takes a String input, no output
        printMessage.accept("Hello from Consumer!");

        Person p1 = new Person();
        Consumer<String> setPersonName = (name) -> p1.setName(name);
        setPersonName.accept("John Doe");
        System.out.println("Person's name: " + p1.getName());


        Predicate<Integer> isEven = number -> number % 2 == 0; // takes an Integer input, returns a boolean
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 5 even? " + isEven.test(5));


        Function<String , Integer> stringLength = str -> str.length(); // takes a String input, returns its length as Integer
        System.out.println("Length of 'Hello': " + stringLength.apply("Hello"));


        Supplier<Double> randomNumber = () -> Math.random(); // no input, returns a random double
        System.out.println("Random number: " + randomNumber.get());


    }
}

class Person { private String name; public String getName() { return name; } public void setName(String name) { this.name = name; }

}
