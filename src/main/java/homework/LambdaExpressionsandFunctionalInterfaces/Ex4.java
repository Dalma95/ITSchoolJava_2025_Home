package homework.LambdaExpressionsandFunctionalInterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//4. You are given a List<String> representing a list of words. Create a lambda expression to sort the list in alphabetical order. Next, modify your lambda expression to sort the list in reverse alphabetical order.
public class Ex4 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("mere", "pere","apa", "banane", "cirese");

        Collections.sort(words, (s1, s2) -> s1.compareTo(s2));
        System.out.println(words);
        Collections.sort(words, (s1, s2) -> s2.compareTo(s1));
        System.out.println(words);
    }
}
