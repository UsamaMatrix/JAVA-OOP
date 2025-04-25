// Coordinate.java
public class Coordinate {
    private double x;
    private double y;

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return String.format("Coordinate: (%.2f, %.2f)", x, y);
    }
}
