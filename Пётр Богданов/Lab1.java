class Lab1
{
	public static void main(String[] args)
	{
	Point3d p1=new Point3d(Double.valueOf(args[0]),Double.valueOf(args[1]),Double.valueOf(args[2]));
	Point3d p2=new Point3d(Double.valueOf(args[3]),Double.valueOf(args[4]),Double.valueOf(args[5]));
	Point3d p3=new Point3d(Double.valueOf(args[6]),Double.valueOf(args[7]),Double.valueOf(args[8]));
	if (p1.equally(p2)==false && p2.equally(p3)==false && p1.equally(p3)==false)
		System.out.println(Point3d.computeArea(p1,p2,p3));
	}
}