public class Lab1 {
    public static void main(String[] args) {
        Point3d p1 = new Point3d(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
        Point3d p2 = new Point3d(Double.parseDouble(args[3]), Double.parseDouble(args[4]), Double.parseDouble(args[5]));
        Point3d p3 = new Point3d();

        System.out.println("Point 1: " +  p1.getX() + " " + p1.getY() + " " + p1.getZ());
        System.out.println("Point 2: " +  p2.getX() + " " + p2.getY() + " " + p2.getZ());
        System.out.println("Point 3: " +  p3.getX() + " " + p3.getY() + " " + p3.getZ());
        System.out.println("Area of a triangle: " + computeArea(p1, p2, p3));
    }

    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
        // Если две точки равны, то площадь не измеряется
        if (p1.isEqual(p2) || p2.isEqual(p3) || p3.isEqual(p1)) {
            return -1;
        } else {
            double a = p1.distanceTo(p2);
            double b = p2.distanceTo(p3);
            double c = p3.distanceTo(p1);
            double p = (a+b+c)/2; // Периметр
            return (Math.sqrt(p*(p-a)*(p-b)*(p-c))); // Формула герона
        }
    }
}
