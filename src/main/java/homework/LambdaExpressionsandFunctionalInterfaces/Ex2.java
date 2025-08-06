package homework.LambdaExpressionsandFunctionalInterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//2. Write a program that uses lambda expressions to sort a list of strings in alphabetical order.
public class Ex2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello","apple","laptop","weekend","summer");

        System.out.println(words);
        Collections.sort(words, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted list: " + words);
    }
}


