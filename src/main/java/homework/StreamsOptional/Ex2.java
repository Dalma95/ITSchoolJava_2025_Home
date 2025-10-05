package homework.StreamsOptional;

//2. Using a list of strings, find and print the longest string using Java streams. (Input: List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");)

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        String longest = strings.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        System.out.println(longest);
    }
}
