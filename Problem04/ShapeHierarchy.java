abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract void displayInfo();
}

abstract class TwoDimensionalShape extends Shape {
    public TwoDimensionalShape(String name) {
        super(name);
    }

    public abstract double area();
}

abstract class ThreeDimensionalShape extends Shape {
    public ThreeDimensionalShape(String name) {
        super(name);
    }

    public abstract double area();
    public abstract double volume();
}

class Circle extends TwoDimensionalShape {
    double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void displayInfo() {
        System.out.println(name + " Area: " + area());
    }
}

class Square extends TwoDimensionalShape {
    double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public void displayInfo() {
        System.out.println(name + " Area: " + area());
    }
}

class Sphere extends ThreeDimensionalShape {
    double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }

    public void displayInfo() {
        System.out.println(name + " Area: " + area() + ", Volume: " + volume());
    }
}

class Cube extends ThreeDimensionalShape {
    double side;

    public Cube(double side) {
        super("Cube");
        this.side = side;
    }

    public double area() {
        return 6 * side * side;
    }

    public double volume() {
        return side * side * side;
    }

    public void displayInfo() {
        System.out.println(name + " Area: " + area() + ", Volume: " + volume());
    }
}

public class ShapeHierarchy {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Sphere sphere = new Sphere(3);
        Cube cube = new Cube(2);

        circle.displayInfo();
        square.displayInfo();
        sphere.displayInfo();
        cube.displayInfo();
    }
}
