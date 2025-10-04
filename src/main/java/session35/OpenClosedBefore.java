package session35;

import java.util.Objects;

public class OpenClosedBefore {
}

class AreaCalculator{
    double calculateArea (Object shape){
        if(shape instanceof Circle){

            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        }
        if(shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.lenght * rectangle.width;
        }
        return 0;

    }
}

class Circle{
    double radius;
}

class Rectangle{
    double lenght;
    double width;
}
