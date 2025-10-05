package homework.StreamsOptional;

//11. Create a stream from a text file and use stream operations to find and print the longest word in the file.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Optional;

public class Ex11 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\DalMil\\Desktop\\New Text Document.txt";

        Optional<String> longestWord = Files.lines(Paths.get(filePath))
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .map(line -> line.replaceAll("[^a-zA-Z]", ""))
                .filter(word -> !word.isEmpty())
                .max((w1, w2) -> Integer.compare(w1.length(), w2.length()));

        longestWord.ifPresent(System.out::println);
    }


}
