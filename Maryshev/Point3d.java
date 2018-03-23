class Point3d /*implements Comparator<Point3D>, Comparable<Point3d>*/ {
private double xcoord, ycoord, zcoord;
    public Point3d(double x, double y, double z){
        xcoord = x;
        ycoord = y;
        zcoord = z;
    }
    public Point3d() {
        xcoord = 0.0;
        ycoord = 0.0;
        zcoord = 0.0;
    }
    public double GetX() {
        return xcoord;
    }
    public double GetY() {
        return ycoord;
    }
    public double GetZ() {
        return zcoord;
    }
    public void SetX(double val) {
        xcoord = val;
    }
    public void SetY(double val) {
        ycoord = val;
    }
    public void SetZ(double val) {
        zcoord = val;
    }
    public boolean equals(Point3d a){
        if ((this.xcoord == a.GetX()) && (this.ycoord == a.GetY())
            && (this.zcoord == a.GetZ()))
	    return true;
        return false;
    }
    public double distanceTo(Point3d a){
	return Math.sqrt((a.GetX() - this.xcoord)*(a.GetX() - this.xcoord)
            + (a.GetY() - this.ycoord)*(a.GetY() - this.ycoord) +  (a.GetZ()
            - this.zcoord)*(a.GetZ() - this.zcoord));
    }
    public double computeArea(Point3d a, Point3d b){
      double as = this.distanceTo(a);
      double bs = this.distanceTo(b);
      double cs = b.distanceTo(a);
      double p = 0.5 * (as + bs + cs);
      return Math.sqrt(p * (p - as) * (p - bs) * (p - cs));
    }
}
