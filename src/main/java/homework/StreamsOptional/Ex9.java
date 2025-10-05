package homework.StreamsOptional;

//9. Given a list of sentences, use flatMap to create a list of all words in all the sentences, and then find the most frequently occurring word. (Input: List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");)

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex9 {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");

        Map<String, Long> wordFrequency = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Optional<Map.Entry<String, Long>> mostFrequent = wordFrequency.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        mostFrequent.ifPresent(entry ->
            System.out.println("Most frequent word: " + entry.getKey() + " (occurs " + entry.getValue() + " times)")
        );



    }
}
