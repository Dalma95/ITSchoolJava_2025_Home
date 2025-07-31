package homework.EqualsHashcodeGenericsEnum;
//1. Implement the equals() and hashCode() methods for a Rectangle class with width and height fields. Test that two instances with the same width and height return true for equals() and have the same hash code.

import java.util.Objects;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    public static void main(String[] args) {
        Rectangle rectangle1= new Rectangle(3,6);
        Rectangle rectangle2 = new Rectangle(3,6);

        System.out.println("Are the rectangles equal? " + rectangle1.equals(rectangle2));
        System.out.println("Hash code of rectangle1: " + rectangle1.hashCode());
        System.out.println("Hash code of rectangle2: " + rectangle2.hashCode());
    }
}
