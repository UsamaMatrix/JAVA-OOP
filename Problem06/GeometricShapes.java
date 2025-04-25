// Point class to represent coordinates
class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Quadrilateral {
    Point p1, p2, p3, p4;

    Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
}

class Trapezoid extends Quadrilateral {
    double height, base1, base2;

    Trapezoid(double base1, double base2, double height) {
        super(null, null, null, null);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    double area() {
        return 0.5 * (base1 + base2) * height;
    }
}

class Parallelogram extends Quadrilateral {
    double base, height;

    Parallelogram(double base, double height) {
        super(null, null, null, null);
        this.base = base;
        this.height = height;
    }

    double area() {
        return base * height;
    }
}

class Rectangle extends Parallelogram {

    Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    double area() {
        return base * height;
    }
}

class MySquare extends Rectangle {
    MySquare(double side) {
        super(side, side);
    }

    @Override
    double area() {
        return base * base;
    }
}

public class GeometricShapes {
    public static void main(String[] args) {
        Trapezoid t = new Trapezoid(10, 12, 5);
        Parallelogram p = new Parallelogram(8, 4);
        Rectangle r = new Rectangle(7, 3);
        MySquare s = new MySquare(6);

        System.out.printf("Trapezoid Area: %.2f%n", t.area());
        System.out.printf("Parallelogram Area: %.2f%n", p.area());
        System.out.printf("Rectangle Area: %.2f%n", r.area());
        System.out.printf("Square Area: %.2f%n", s.area());
    }
}
