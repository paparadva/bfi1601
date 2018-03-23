// java Point3dapp 2 4.5 7 0.5 3.1 8.4 2 4.5 7

class Lab1 {
  public static void main(String[] args) {
    Point3d point1   = new Point3d(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]));
    Point3d point2   = new Point3d(Double.parseDouble(args[3]),Double.parseDouble(args[4]),Double.parseDouble(args[5]));
    Point3d point3   = new Point3d(Double.parseDouble(args[6]),Double.parseDouble(args[7]),Double.parseDouble(args[8]));
    System.out.println("Point1 coordinates   X = " + point1.GetX() + "   Y = " + point1.GetY() + "   Z = " +point1.GetZ());
    System.out.println("Point2 coordinates   X = " + point2.GetX() + "   Y = " + point2.GetY() + "   Z = " +point2.GetZ());
    System.out.println("Point3 coordinates   X = " + point3.GetX() + "   Y = " + point3.GetY() + "   Z = " +point3.GetZ());
    System.out.println("point1.equals(point1) is " + point1.equals(point1));
    System.out.println("point1.equals(point2) is " + point1.equals(point2));
    System.out.println("point1.equals(point3) is " + point1.equals(point3));
    System.out.println("point1.distanceTo(point2) = " + point1.distanceTo(point2));
    System.out.println("point2.distanceTo(point3) = " + point2.distanceTo(point3));
    System.out.println("point3.distanceTo(point1) = " + point3.distanceTo(point1));
    System.out.println("computeArea = " + point1.computeArea(point2, point3));
  }
}
