class Lab1{
	public static void main(String [] args){
		Point3d first = new Point3d(Double.valueOf(args[0]),Double.valueOf(args[1]),Double.valueOf(args[2]));
		Point3d second = new Point3d(Double.valueOf(args[3]),Double.valueOf(args[4]),Double.valueOf(args[5]));
		Point3d third = new Point3d(Double.valueOf(args[6]),Double.valueOf(args[7]),Double.valueOf(args[8]));
		if ((first.equals(second) && first.equals(third) && second.equals(third))!=true)
            System.out.println(Point3d.computeArea(first,second,third));
	}
}