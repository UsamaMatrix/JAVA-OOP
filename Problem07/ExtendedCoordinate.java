// Base class for 2D coordinates
class Coordinate {
    protected double x, y;

    Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getDistance() {
        return Math.sqrt(x * x + y * y);
    }
}

class MyExtendedCoordinate extends Coordinate {
    private Double z;

    MyExtendedCoordinate(double x, double y) {
        super(x, y);
        this.z = null;
    }

    MyExtendedCoordinate(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    double getDistance() {
        if (z == null) {
            return super.getDistance();
        } else {
            return Math.sqrt(x * x + y * y + z * z);
        }
    }

    static double getDistanceBetween(MyExtendedCoordinate p1, MyExtendedCoordinate p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;

        double z1 = p1.z != null ? p1.z : 0;
        double z2 = p2.z != null ? p2.z : 0;

        double dz = z1 - z2;

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}

public class ExtendedCoordinate {
    public static void main(String[] args) {
        MyExtendedCoordinate p2D = new MyExtendedCoordinate(3, 4);
        MyExtendedCoordinate p3D = new MyExtendedCoordinate(1, 2, 2);
        MyExtendedCoordinate p3D2 = new MyExtendedCoordinate(4, 6, 3);

        System.out.printf("Distance of 2D point from origin: %.2f%n", p2D.getDistance());
        System.out.printf("Distance of 3D point from origin: %.2f%n", p3D.getDistance());
        System.out.printf("Distance between two 3D points: %.2f%n",
                MyExtendedCoordinate.getDistanceBetween(p3D, p3D2));
    }
}
