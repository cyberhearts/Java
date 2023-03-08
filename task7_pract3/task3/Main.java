package task7_pract3.task3;
import java.util.Scanner;

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
        }

        class Triangle{
            Point[] points = new Point[3];

            Triangle(){
                Scanner scan = new Scanner(System.in);
                for (int i = 0; i < points.length; i++) {
                    System.out.print("enter [" + i + "] point:");                    
                    points[i] = new Point(scan.nextDouble(), scan.nextDouble());
                }
            }
            
            public void print(){
                for (Point point : points) {
                    System.out.println(point.xPoint + " " + point.yPoint);
                }
            }

            public double Square() {
                System.out.println("Square: " + (0.5 * this.points[0].xPoint  * this.points[1].yPoint));
                return 0.5 * this.points[0].xPoint  * this.points[1].yPoint;
            }

            public double Perimetr() {
                System.out.println("Perimetr: " + (this.points[0].xPoint + this.points[1].xPoint + this.points[2].xPoint));
                return this.points[0].xPoint + this.points[1].xPoint + this.points[2].xPoint;
            }
        }

        Triangle triangle = new Triangle();
        triangle.Perimetr();
        triangle.Square();
        triangle.print();
    }
        

        
}
