package session35;

public class OpenClosedAfter {
    public static void main(String[] args) {
        Shape circleA = new CircleA(10.2);
        System.out.println("circle " + circleA.calculateArea());

        Shape regtangle = new Rectangular(12,34);
        System.out.println("rectangle: "+ regtangle.calculateArea());

        Shape square = new Square(4);
        System.out.println("square: " + square.calculateArea());

    }
}
interface Shape{

    double calculateArea();
}

class CircleA implements Shape{
    double radius;

    public CircleA(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        return Math.PI * radius * radius;
    }
}

class Rectangular implements Shape{
    double lenght;
    double width;

    public Rectangular(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return lenght * width;
    }
}

class Square implements Shape{
    double lenght;

    public Square(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double calculateArea() {
        return lenght*lenght;
    }
}
