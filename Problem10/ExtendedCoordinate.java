// ExtendedCoordinate.java
public class ExtendedCoordinate extends Coordinate {
    private double z;

    public ExtendedCoordinate(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public double getDistance() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(z, 2));
    }

    public double getDistanceBetween(ExtendedCoordinate other) {
        double dx = getX() - other.getX();
        double dy = getY() - other.getY();
        double dz = z - other.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    @Override
    public String toString() {
        return String.format("ExtendedCoordinate: (%.2f, %.2f, %.2f)", getX(), getY(), z);
    }
}
