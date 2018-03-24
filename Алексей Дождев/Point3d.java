import java.io.*;
public class Point3d
{
    private double xCoord;
    private double yCoord;
    private double zCoord;
    public Point3d (double x, double y,double z)
    {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d()
    {
        this (0.0,0.0,0.0);
    }
    public double getX()
    {
        return xCoord;
    }
    public double getY()
    {
        return yCoord;
    }
    public double getZ()
    {
        return zCoord;
    }
    public void setX(double val)
    {
        xCoord = val;
    }
    public void setY(double val)
    {
        yCoord = val;
    }
    public void setZ(double val)
    {
        zCoord = val;
    }
    public double ToDistance(Point3d toch){
        return Math.sqrt((this.getX() - toch.getX())*(this.getX() - toch.getX())
                + (this.getY() - toch.getY())*(this.getY() - toch.getY())
                + (this.getZ() - toch.getZ())*(this.getZ() - toch.getZ()));
    }
    public double CompArea(Point3d p2,Point3d p3){
        double a = this.ToDistance(p2);
        double b = this.ToDistance(p3);
        double c = p2.ToDistance(p3);
        double p = 0.5*(a + b + c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public static void main(String[] args)
    {
    }
}