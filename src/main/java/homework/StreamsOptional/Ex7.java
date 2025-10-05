package homework.StreamsOptional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//7. Use streams to transform a list of strings into a list of their respective lengths. (Input: List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");)
public class Ex7 {
    public static void main(String[] args) {
        List<String> string = Arrays.asList("Hello", "World", "Java", "Streams");

        List<Integer> stringLenght = string.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(stringLenght);
    }
}
