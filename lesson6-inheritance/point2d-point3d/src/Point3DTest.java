public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(2, 3, 4);
        System.out.println(point3D);
        point3D.setXYZ(4, 5, 6);
        System.out.println(point3D);
        for (float a : (point3D.getXYZ())) {
            System.out.print(a + " ");
        }
    }
}
