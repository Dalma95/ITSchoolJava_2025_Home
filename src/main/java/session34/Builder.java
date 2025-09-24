package session34;

import java.util.ArrayList;
import java.util.List;

class Pizza{
    private  String blat;
    private String sos;
    private List<String> toppings;

    public static class PizzaBuilder{

        private Pizza pizza;

        public PizzaBuilder(){
            pizza = new Pizza();
            pizza.toppings = new ArrayList<>();
        }

        public PizzaBuilder blat(String blat){
            pizza.blat = blat;
            return this;
        }
        public PizzaBuilder sos (String sos){
            pizza.sos = sos;
            return this;
        }
        public PizzaBuilder addToppings (String topping){
            pizza.toppings.add(topping);
            return this;
        }
        public Pizza build(){
            return pizza;
        }
        }

    @Override
    public String toString() {
        return "Pizza{" +
                "blat='" + blat + '\'' +
                ", sos='" + sos + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}

class Pizza2{
    private  String blat;
    private String sos;
    private List<String> toppings;

    public Pizza2 withBlat(String blat){
        this.blat = blat;
        return this;
    }
    public Pizza2 withSos(String sos){
        this.sos = sos;
        return this;
    }
    public Pizza2 withTopping (String topping){
        if (toppings == null) toppings = new ArrayList<>();
        toppings.add(topping);
        return this;
    }

    @Override
    public String toString() {
        return "Pizza2{" +
                "blat='" + blat + '\'' +
                ", sos='" + sos + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}




public class Builder {
    public static void main(String[] args) {

        Pizza pizza = new Pizza.PizzaBuilder()
                .blat("subtire")
                .sos("sos de rosii")
                .addToppings("mozzarella")
                .addToppings("sunca")
                .addToppings("porumb")
                .build();

        System.out.println(pizza.toString());

        Pizza2 pizza2 = new Pizza2()
                .withBlat("pufos")
                .withSos("rosii")
                .withTopping("branza")
                .withTopping("pui")
                .withTopping("porumb");

        System.out.println(pizza2);

    }
}
