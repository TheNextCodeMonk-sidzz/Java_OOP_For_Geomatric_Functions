package Methods_and_oops;

public class Oops_Q1_Hard {
    static class Point{
        double x;
        double y;

        Point(double x,double y){
            this.x=x;
            this.y=y;
        }
    }
    static class Point3D extends Point {
        double z;

        Point3D(double x, double y, double z) {
            super(x, y);
            this.z = z;
        }
        public static double distanceIn3D(Point3D[] pts) {
            // assume pts.length == 2
            Point3D a = pts[0];
            Point3D b = pts[1];

            return Math.sqrt(
                    Math.pow(b.x - a.x, 2) +
                            Math.pow(b.y - a.y, 2) +
                            Math.pow(b.z - a.z, 2)
            );
        }
    }

    static double twoPointsDistance(Point pointA, Point pointB){

        return (Math.sqrt(Math.pow(pointB.x-pointA.x,2)+Math.pow(pointB.y-pointA.y,2)));

    }

//    Point [] triangle={new Point(0, 0), new Point(4, 0), new Point(0, 3)};
    static double areaOfTriangle(Point[] points){
        double A=twoPointsDistance(points[0],points[1]);
        double B=twoPointsDistance(points[1],points[2]);
        double C=twoPointsDistance(points[2],points[0]);

        double s= (A+B+C)/2;
        return Math.sqrt(s*(s-A)*(s-B)*(s-C));

    }

    public static double lineChecker(double Total_Area, double Area1,double Area2,double Area3){
        if(Math.abs(Total_Area - (Area1 + Area2 + Area3)) < 0.0001)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args){
        Point[] triangle = {new Point(0, 0), new Point(4, 0), new Point(0, 3)};
        double TotalArea = areaOfTriangle(triangle);
        Point P = new Point(1, 1);

        double Area1 = areaOfTriangle(new Point[]{P, triangle[1], triangle[2]});
        double Area2 = areaOfTriangle(new Point[]{triangle[0], P, triangle[2]});
        double Area3 = areaOfTriangle(new Point[]{triangle[0], triangle[1], P});

        System.out.println("Is point inside? " + lineChecker(TotalArea, Area1, Area2, Area3));

        // Test 3D
        Point3D[] pts3D = {new Point3D(1, 2, 3), new Point3D(4, 6, 8)};
        System.out.println("Distance in 3D: " + Point3D.distanceIn3D(pts3D));

    }


}




//
//




