package Methods_and_oops;

import java.util.Arrays;

public class CoordinateGeometry {

    public static double twoPointsDistance(double x1, double x2, double y1, double y2){

        double distance=(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
        return distance;
    }

    public static double areaOfTriangle(double x1, double x2, double x3, double y1, double y2, double y3){
        double A=twoPointsDistance(x1,x2,y1,y2);
        double B=twoPointsDistance(x2,x3,y2,y3);
        double C=twoPointsDistance(x3,x1,y3,y1);

        double s= (A+B+C)/2;
        double Area= Math.sqrt(s*(s-A)*(s-B)*(s-C));
        return Area ;
    }

    public static double lineChecker(double Total_Area, double Area1,double Area2,double Area3){
        if(Math.abs(Total_Area - (Area1 + Area2 + Area3)) < 0.0001)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args){

        double Total_Area=areaOfTriangle(0,4,0,0,0,3);
        double Area1=areaOfTriangle(1,4,0,1,0,3);
        double Area2=areaOfTriangle(0,1,0,0,1,3);
        double Area3=areaOfTriangle(0,4,1,0,0,1);

        double Answer=lineChecker(Total_Area,Area1,Area2,Area3);
        System.out.println(Answer);

    }
}
