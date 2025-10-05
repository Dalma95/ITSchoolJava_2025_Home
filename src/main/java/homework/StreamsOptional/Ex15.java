package homework.StreamsOptional;

//15. Given a list of books with attributes: title, author, and year of publication; use streams to find all the books published before the year 2000 and group them by author in a map where the key is the author and the value is a list of titles of their books.

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex15 {
    public static void main(String[] args) {

        List<Book> books = List.of(
                new Book("The Da Vinci Code","Dan Brown", 2003),
                new Book("Harry Potter and the Goblet of Fire", "J.K.Rowling", 2000),
                new Book("The Kite Runner","Khaled Hosseini",2003),
                new Book("To Kill a Mockingbird","Harper Lee",1960),
                new Book("The Great Gatsby","F. Scott Fitzgerald",1925));

        Map<String, List<String>> publishedBefore = books.stream()
                .filter(book -> book.getPublicationYear() < 2000)
                .collect(Collectors.groupingBy(
                        Book::getAuthor,
                        Collectors.mapping(Book::getTitle,Collectors.toList())));

        publishedBefore.forEach((author, titles) -> {
            System.out.println(author + " → " + titles);
        });

    }

    static class Book{
        String title;
        String author;
        int publicationYear;

        public Book(String title, String author, int publicationYear) {
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getPublicationYear() {
            return publicationYear;
        }
    }
}

