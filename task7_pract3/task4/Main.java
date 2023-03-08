package task7_pract3.task4;
import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args) {
        class Point{
            double xPoint;
            double yPoint;
            Point(double x, double y){
                this.xPoint = x;
                this.yPoint = y;
            }
        
            
            public void setPoint(double xPoint, double yPoint){
                this.xPoint = xPoint;
                this.yPoint = yPoint;
            }

            
            public void surface_quater() {
                if(this.xPoint > 0 && this.yPoint > 0){
                    System.out.println("I quater");
                }
                else if(this.xPoint < 0 && this.yPoint > 0){
                    System.out.println("II quater");                    
                }
                else if(this.xPoint < 0 && this.yPoint < 0){
                    System.out.println("III quater");                    
                }
                else{
                    System.out.println("IV quater");
                }
            }
        }

        class Surface{
            Point[] points = new Point[1];
            Surface(){
                Scanner scan = new Scanner(System.in);
                for (int i = 0; i < points.length; i++) {
                    System.out.print("Enter point");
                    points[i] = new Point(scan.nextDouble(), scan.nextDouble());
                }
            }
            public void check2points(Point point1, Point point2){
                if(point1.xPoint + point2.xPoint == 0 && point1.yPoint + point2.yPoint == 0){
                    System.out.println("Symetrical");
                }
                else{
                    System.out.println("non Symetrical");
                }
            }
            
            public void collinear(Point point1, Point point2, Point point3) {
                if(point1.xPoint == point2.xPoint && point1.xPoint == point3.xPoint){
                    System.out.println("Collinear");
                }
                else{
                    
                    System.out.println("none Collinear");
                }
            }
        }   

        Point point1 = new Point(10, 3);
        Point point3 = new Point(10, -3);
        Surface surface = new Surface();
        surface.check2points(point3, point1);
        surface.collinear(point1, point3, surface.points[0]);
    }
}