class Shape {
    String color = "Blue";

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class CircleShape extends Shape {
    double radius = 4.0;

    void area() {
        System.out.printf("Circle Area = %.2f\n", (Math.PI * radius * radius));
    }
}

class SquareShape extends Shape {
    double side = 5.0;

    void area() {
        System.out.println("Square Area = " + (side * side));
    }
}

public class ShapeHierarchy {
    public static void main(String[] args) {
        CircleShape c = new CircleShape();
        c.displayColor();
        c.area();

        SquareShape s = new SquareShape();
        s.displayColor();
        s.area();
    }
}