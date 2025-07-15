package Methods_and_oops;

public class Oops_Q1_Hard {

    public static double twoPointsDistance(Point pointA, Point pointB) {
        return Math.sqrt(Math.pow(pointB.x - pointA.x, 2) + Math.pow(pointB.y - pointA.y, 2));
    }

    public static double areaOfTriangle(Point[] points) {
        double A = twoPointsDistance(points[0], points[1]);
        double B = twoPointsDistance(points[1], points[2]);
        double C = twoPointsDistance(points[2], points[0]);

        double s = (A + B + C) / 2;
        return Math.sqrt(s * (s - A) * (s - B) * (s - C));
    }

    public static double lineChecker(double totalArea, double a1, double a2, double a3) {
        return Math.abs(totalArea - (a1 + a2 + a3)) < 0.0001 ? 1 : 0;
    }

    public static void main(String[] args) {
        Point[] triangle = {new Point(0, 0), new Point(4, 0), new Point(0, 3)};
        Point P = new Point(1, 1);

        double totalArea = areaOfTriangle(triangle);
        double area1 = areaOfTriangle(new Point[]{P, triangle[1], triangle[2]});
        double area2 = areaOfTriangle(new Point[]{triangle[0], P, triangle[2]});
        double area3 = areaOfTriangle(new Point[]{triangle[0], triangle[1], P});

        System.out.println("Is point inside? " + lineChecker(totalArea, area1, area2, area3));

        Point3D[] pts3D = {new Point3D(1, 2, 3), new Point3D(4, 6, 8)};
        System.out.println("Distance in 3D: " + Point3D.distanceIn3D(pts3D));
    }
}
