
public class Lab1 {
    public static void main(String[] args) {
        Point3d p1 = new Point3d(Double.valueOf(args[0]), Double.valueOf(args[1]), Double.valueOf(args[2]));
        Point3d p2 = new Point3d(Double.valueOf(args[3]), Double.valueOf(args[4]), Double.valueOf(args[5]));
        Point3d p3 = new Point3d(Double.valueOf(args[6]), Double.valueOf(args[7]), Double.valueOf(args[8]));

        double area = 0;
        try {
            area = Point3d.computeArea(p1, p2, p3);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        System.out.println("Площадь треугольника:");
        System.out.println(area);
    }
}
