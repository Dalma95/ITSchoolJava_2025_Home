package homework.StreamsOptional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 5. Given a list of people with attributes: first name, last name, and age; use streams to find all people who are older than 18 years.
//class Person {
//    String firstName;
//    String lastName;
//    int age;
//}
//List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));
public class Ex5 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));

        List<String> names = people.stream()
                .filter(pers -> pers.getAge() > 18)
                .map(pers -> pers.getFirstName() + " "+ pers.getLastName())
                .toList();

        names.forEach(System.out::println);


    }
}

class Person{
    String firstName;
    String lastName;
    int age;

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;


    }
}
