
public class Point3 {
    private double xCoord;
    private double yCoord;
    private double zCoord;
    public Point2d (double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d () {
        this (0.0, 0.0, 0.0);
    }
    public double getX () {
        return xCoord;
    }
    public double getY () {
        return yCoord;
    }
    public double getZ () {
        return zCoord;
    }
    public void setX (double val) {
        xCoord = val;
    }
    public void setY (double val) {
        yCoord = val;
    }
    public void setZ (double val) {
        ZCoord = val;
    }
    public static void main(String[] args)
    {
        Point3d myPoint = new Point3d ();//создает точку в (0,0)
        Point3d myOtherPoint = new Point3d (5,3,1);//создает точку в (5,3)
        Point3d aThirdPoint = new Point3d ();
        System.out.println(myPoint);
    }
}
