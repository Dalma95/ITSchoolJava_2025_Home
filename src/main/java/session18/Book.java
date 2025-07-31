package session18;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private Integer numPages;
    private String isbn;

    public Book(String title, String author, Integer numPages, String isbn) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.isbn = isbn;
    }

    @Override
    public boolean equals( Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(isbn, book.isbn) &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                numPages.equals(book.numPages);
    }
    @Override
    public int hashCode(){
        return Objects.hash(isbn, title,author,numPages);
    }
    @Override
    public String toString(){
        return "Book[" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numPages=" + numPages +
                ", isbn='" + isbn + '\'' +
                ']';
    }
}

class Box <T>{
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

}

class Pair <K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

}

class LibraryDemo{
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert C. Martin", 464, "978-0132350884");
        Book book2 = new Book("Clean Code", "Robert C. Martin", 464, "978-0132350884");
        Book book3 = new Book("Effective Java", "Joshua Bloch", 416, "978-0134686097");

        System.out.println("book1 equals book2: " + book1.equals(book2));
        System.out.println("book1 equals book3: " + book1.equals(book3));

        System.out.println("book1 hashCode: " + book1.hashCode());
        System.out.println("book2 hashCode: " + book2.hashCode());
        System.out.println("book3 hashCode: " + book3.hashCode());

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        Box<Book> bookBox = new Box<>();
        bookBox.setItem(book1);
        System.out.println("Box contains: " + bookBox.getItem());

        System.out.println("------------------------------------------");
        Pair<String, Integer> bookScore = new Pair<>("Clean Code", 5);
        System.out.println("Book: " + bookScore.getKey() + ", Score: " + bookScore.getValue());

        Book book4 = new Book("The Da Vinci Code", "Dan Brown", 689, "978-0307474278");
        Pair<String,Book> favoriteBook = new Pair<>("Favorite", book4);
        System.out.println("Favorite Book: " + favoriteBook.getKey() + ", Details: " + favoriteBook.getValue());

        System.out.println("----------------------------------------------");
        Map<Book, Integer> inventory = new HashMap<>();
        inventory.put(book1,2);
        inventory.put(book3,4);
        inventory.put(book2,1);
        System.out.println("Library Inventory:");
        System.out.println(inventory);


    }
}
