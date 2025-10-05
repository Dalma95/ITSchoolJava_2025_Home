package homework.StreamsOptional;

import java.util.Arrays;
import java.util.List;

//10. Using streams, find the total number of characters across a list of strings excluding whitespace characters. (Input: List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");)Using streams, find the total number of characters across a list of strings excluding whitespace characters. (Input: List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");)
public class Ex10 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");

        long numberOfCharacters = strings.stream()
                .mapToInt(s -> s.replaceAll("\\s+", "").length())
                .sum();

        System.out.println(numberOfCharacters);
    }
}
