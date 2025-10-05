package homework.StreamsOptional;

import java.util.Arrays;

//8. Given a string, use streams to count the number of vowels in it. (Input: String sentence = "Hello World";)
public class Ex8 {
    public static void main(String[] args) {

        String sentence = "Hello World";

       long vowels = sentence
               .toLowerCase()
               .chars()
               .mapToObj(ch -> (char) ch)
               .filter(character -> "aeiou".indexOf(character) != -1)
               .count();

        System.out.println(vowels);


    }
}

