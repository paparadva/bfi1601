public class Point3d
{
	private double xCoord;
	private double yCoord;
	private double zCoord;
	public Point3d(double x,double y,double z)
	{
		xCoord = x;
        yCoord = y;
        zCoord = z;
	}
	public Point3d()
	{
		xCoord = 0;
        yCoord = 0;
        zCoord = 0;
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
	public boolean equally(Point3d p)
	{
		if (p.xCoord!=this.xCoord||p.yCoord!=this.yCoord||p.zCoord!=this.zCoord)
			return false;
		return true;
	}
	public double distanceTo(Point3d p)
	{
		return Math.sqrt(Math.pow(p.xCoord-this.xCoord,2)+Math.pow(p.yCoord-this.yCoord,2)+Math.pow(p.zCoord-this.zCoord,2));
	}
	public static void main(String[] args)
	{
		Point3d p1 = new Point3d ();
    	Point3d p2 = new Point3d (5,3.2,1);
    	System.out.println(p1.equally(p2));
    	System.out.println(p1.distanceTo(p2));

	}
	public static double computeArea(Point3d p1,Point3d p2,Point3d p3)
	{
		double a=p1.distanceTo(p2);
		double b=p2.distanceTo(p3);
		double c=p1.distanceTo(p3);
		double p=(a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}