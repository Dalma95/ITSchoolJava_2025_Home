package homework.StreamsOptional;

//14. Given a list of products with attributes: name, category, and price; find the category with the highest average price.

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex14 {
    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("Laptop", "Electronics", 1200.0),
                new Product("Smartphone", "Electronics", 800.0),
                new Product("Desk", "Furniture", 300.0),
                new Product("Chair", "Furniture", 150.0),
                new Product("Headphones", "Electronics", 200.0)
        );

        Map<String,Double> highestPrice = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));

        String category = highestPrice.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println(category);
    }
}

class Product{
    String name;
    String category;
    double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}
