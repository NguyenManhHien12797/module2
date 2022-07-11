public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3.5,"yelow",4);
        System.out.println(cylinder);

        cylinder = new Cylinder(3.5, "indigo",4);
        System.out.println(cylinder);
    }
}
