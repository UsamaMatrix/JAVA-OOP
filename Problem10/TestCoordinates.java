// TestCoordinates.java
public class TestCoordinates {
    public static void main(String[] args) {
        Coordinate point2D = new Coordinate(3.0, 4.0);
        System.out.println(point2D);
        System.out.println("Distance from origin (2D): " + point2D.getDistance());

        ExtendedCoordinate point3D = new ExtendedCoordinate(3.0, 4.0, 5.0);
        System.out.println(point3D);
        System.out.println("Distance from origin (3D): " + point3D.getDistance());

        ExtendedCoordinate point3D2 = new ExtendedCoordinate(1.0, 2.0, 2.0);
        System.out.println("Distance between point3D and point3D2: " + point3D.getDistanceBetween(point3D2));
    }
}
