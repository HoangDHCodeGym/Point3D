public class PointTest {
    public static void main(String[] args) {
        Point2D point2d = new Point2D(3,4);
        System.out.println(point2d.toString());

        Point3D point3d = new Point3D(2,3,4);
        System.out.println(point3d.toString());
        point3d.setXYZ(1,2,3);
        System.out.println(point3d.toString());
    }
}
