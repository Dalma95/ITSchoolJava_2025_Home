package homework.EqualsHashcodeGenericsEnum;
//9. Create a method that returns a JSON representation of an object. The method should make use of the toString method to facilitate this.
public class ToJson {
    public static void main(String[] args) {

        Pers person = new Pers("John", 30);
        System.out.println(person.toJson());
    }

}
 class Pers {
     private String name;
     private int age;

     public Pers(String name, int age) {
         this.name = name;
         this.age = age;
     }

     @Override
     public String toString() {
         return String.format("{\"name\":\"%s\", \"age\":%d}", name, age);
     }

     public String toJson() {
         return this.toString();
     }
 }

