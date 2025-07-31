package homework.EqualsHashcodeGenericsEnum;
//3. Create a Student class with name, age, studentId, and email fields. Implement the equals() method to check all fields except the studentId. Implement the hashCode() method to use all fields except the student Id to calculate the hash code. Test that two instances with the same name, age, and email return true for equals() and have the same hash code.
import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String studentId;
    private String email;

    public Student(String name, int age, String studentId, String email) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.email = email;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return name == student.name &&
                age == student.age &&
                email == student.email;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, age, email);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "S123", "alice20@gmail.com");
        Student student2 = new Student("Alice", 20, "S543", "alice20@gmail.com");

        System.out.println("Are the two students equal? " + student1.equals(student2));
        System.out.println("Hash code of student1: " + student1.hashCode());
        System.out.println("Hash code of student2: " + student2.hashCode());


    }
}
