
public class Point3d {
    private double x;
    private double y;
    private double z;
    public Point3d (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point3d () {
        this (0.0, 0.0, 0.0);
    }
    public double getX () {
        return x;
    }
    public double getY () {
        return y;
    }
    public double getZ () {
        return z;
    }
    public void setX (double x) {
        this.x = x;
    }
    public void setY (double y) {
        this.y = y;
    }
    public void setZ (double z) {
        this.z = z;
    }

    public static void main(String[] args)
    {
        Point3d myPoint = new Point3d ();//создает точку в (0,0)
        Point3d myOtherPoint = new Point3d (5,3.2,1);//создает точку в (5,3)
        Point3d aThirdPoint = new Point3d ();
        System.out.println(myPoint.equals(myOtherPoint));
        System.out.println(myPoint.equals(aThirdPoint));
        System.out.println(myPoint.distaceTo(myOtherPoint));


    }
    public double distaceTo(Point3d o){
        Point3d point3d = (Point3d) o;
        return Math.sqrt(Math.pow(this.x-point3d.x,2) + Math.pow(this.y-point3d.y,2) + Math.pow(this.z-point3d.z,2));
    }

    public boolean equals (Object o){
        if (this == o) return true;
        if ((o==null)||getClass() != o.getClass()) return false;
        Point3d point3d = (Point3d) o;
        return this.x == point3d.x && this.y == point3d.y && this.z == point3d.z;
    }
    public static double computeArea(Point3d first,Point3d second, Point3d third){
        double p=0.5*(first.distaceTo(second)+first.distaceTo(third)+second.distaceTo(third));
        return Math.sqrt(p*(p-first.distaceTo(second))*(p-first.distaceTo(third))*(p-second.distaceTo(third)));
    }
}
