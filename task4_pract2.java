import java.lang.Math;
import java.util.Scanner;

public class task4_pract2 {

    public static void task1(float x){
        float a, b, c, D, x1, x2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("A: ");
        a = scanner.nextFloat();
        System.out.println("B: ");
        b = scanner.nextFloat();
        System.out.println("C: ");
        c = scanner.nextFloat();

        D = (b * b) - (4 * a * c);
        if(D > 0){
            x1 = (float) (-(b) + Math.sqrt(D)) / (2 * a);
            x2 = (float) (-(b) - Math.sqrt(D)) / (2 * a);
        }
        else{
            x1 = (float) (b + Math.sqrt(D)) / (2 * a);
            x2 = (float) (b - Math.sqrt(D)) / (2 * a);
        }

        System.out.println("D = " + D);
        System.out.print("x1: " + x1 + "\nx2: " + x2);
        scanner.close();
    }

    public static void task2(int count_iteration){
        if(count_iteration < 0){
            System.out.println("Error: count iteration must be greater than 0");
        }
        else{
        }
            float S = 0;
            for(int i = 1; i < count_iteration+ 1; i++){
                S += (float) ((Math.pow(8, i) - Math.pow(3, i + 1)) / Math.pow(10, i));
                System.out.println("S[" + i + "] = " + S);
        }
            
    }
    public static void main(String args[])
    {
        task1(1);
    }
}
