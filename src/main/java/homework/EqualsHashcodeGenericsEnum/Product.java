package homework.EqualsHashcodeGenericsEnum;
//5. Create a Product class with name, price, and id fields. Implement the equals() method to check only the id field. Implement the hashCode() method to use the id field to calculate the hash code. Test that two instances with the same id return true for equals() and have the same hash code. Then change the id of one instance and test that they are no longer equal and have different hash codes.
import java.util.Objects;

public class Product {
    private String name;
    private int price;
    private String id;

    public Product(String name, int price, String id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        Product prod1 = new Product("Laptop", 1000, "123");
        Product prod2 = new Product("Laptop", 1000, "123");
        Product prod3 = new Product("Laptop", 1000, "456");

        System.out.println("prod1 equals prod2: " + prod1.equals(prod2));
        System.out.println("prod1 equals prod3: " + prod1.equals(prod3));
        System.out.println("prod1 hashCode: " + prod1.hashCode());
        System.out.println("prod2 hashCode: " + prod2.hashCode());
        System.out.println("prod3 hashCode: " + prod3.hashCode());
    }
}
