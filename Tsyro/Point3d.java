import java.util.Objects;

/**
 * Точка в трехмерном пространстве, определенная тремя координатами (x, y и z).
 */
public class Point3d {

    private double x;
    private double y;
    private double z;

    public Point3d() {
        this(0, 0, 0);
    }

    public Point3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Расстоянием между этой точкой и other.
     *
     * @param other - Точка, до которой рассчитывается расстояние.
     * @return Расстояние от этой точки до other.
     */
    public double distanceTo(Point3d other) {
        return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2) + Math.pow(z - other.z, 2));
    }

    /**
     * Площадь треугольника с вершинами p1, p2 и p3.
     * @throws IllegalArgumentException Если координаты хотя бы двух вершин совпадают
     */
    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
        if(p1.equals(p2) || p2.equals(p3) || p3.equals(p1))
            throw new IllegalArgumentException("Вершины должны иметь различные координаты");

        double a = p1.distanceTo(p2);
        double b = p2.distanceTo(p3);
        double c = p3.distanceTo(p1);
        double s = 0.5 * (a + b + c);

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Point3d point3d = (Point3d) o;

        return this.x == point3d.x && this.y == point3d.y && this.z == point3d.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
