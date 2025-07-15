package Methods_and_oops;

public class Point3D extends Point {


        double z;
        public Point3D(double x, double y, double z){
            super(x,y);
            this.z=z;

        }
        public static double distanceIn3D(Point3D[] pts) {
            Point3D a = pts[0];
            Point3D b = pts[1];
            return Math.sqrt(
                    Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2) + Math.pow(b.z - a.z, 2)
            );
        }

    }



