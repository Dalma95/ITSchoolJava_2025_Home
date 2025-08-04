package session19;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class CoffeeShopApp {
    public static void main(String[] args) {

        GreetingService greeting = ( name) -> System.out.println("Hello, " + name + "! Welcome to our coffee shop.");
        greeting.greet("Alice");

        Supplier<String> idGenerator = () ->"UUID - " + UUID.randomUUID().toString().substring(0, 8);

        Function<String,Order> orderGenerator = (drink) -> new Order(idGenerator.get(),drink);

        List<Order> orders = Arrays.asList(
                orderGenerator.apply("Espresso"),
                orderGenerator.apply("Latte"),
                orderGenerator.apply("Cappuccino"),
                orderGenerator.apply("Americano")
                ,orderGenerator.apply("Migdale Latte"),
                orderGenerator.apply("Soia Cappuccino"));

        System.out.println("Today's orders:");
        Consumer<Order> orderPrinter = (order) -> System.out.println(order);
        orders.forEach(orderPrinter);

        Predicate<Order> isPlantBased = (order) -> order.getDrink().toLowerCase().contains("migdale") || order.getDrink().toLowerCase().contains("soia");
        System.out.println("Plant-based drinks:");
        List<Order> veganOrders = orders.stream()
                .filter(isPlantBased)
                .collect(Collectors.toList());
        System.out.println("Vegan orders: " );
        veganOrders.forEach(orderPrinter);

        Map<String,Double> prices = Map.of(
                "Migdale Latte", 4.50,
                "Soia Cappuccino", 4.00,
                "Espresso", 2.50,
                "Latte", 3.50,
                "Cappuccino", 3.75,
                "Americano", 2.75
        );

        BinaryOperator<Double> totalCalc = Double::sum;
        double totalPrice = orders.stream()
                .map(order -> prices.getOrDefault(order.getDrink(),0.0))
                .reduce(0.0,totalCalc);

        System.out.println("Total price of all orders: $" + totalPrice);

    }
}

@FunctionalInterface
interface GreetingService {
    void greet(String name);
}

class Order{
    private String id;
    private String drink;

    public Order() {
    }

    public Order(String id, String drink) {
        this.id = id;
        this.drink = drink;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}