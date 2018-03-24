public class Lab1{
    public static void main(String[] args)
    {
        Point3d point1 = new Point3d(Double.valueOf(args[0]),Double.valueOf(args[1]),Double.valueOf(args[2]));
        Point3d point2 = new Point3d(Double.valueOf(args[3]),Double.valueOf(args[4]),Double.valueOf(args[5]));
        Point3d point3 = new Point3d(Double.valueOf(args[6]),Double.valueOf(args[7]),Double.valueOf(args[8]));
        System.out.println(point1.getX() + " " + point1.getY() + " " + point1.getZ());
        System.out.println(point2.getX() + " " + point2.getY() + " " + point2.getZ());
        System.out.println(point3.getX() + " " + point3.getY() + " " + point3.getZ());
        System.out.println( point1.ToDistance(point2));
        System.out.println( point1.ToDistance(point3));
        System.out.println( point2.ToDistance(point3));
        System.out.println(point1.CompArea(point2,point3));
    }
}