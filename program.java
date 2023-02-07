import java.util.Scanner;

public class program{
    Scanner scan = new Scanner(System.in);
    public static void foo() {
        int i = 3;
        switch(i)
        {
        default: System.out.println("default");
        break;
        case 1: System.out.println("1");
        break;
        case 2: System.out.println("2");
        break;
        }
    }

    public static void foo2(){
        int i = 0;
        System.out.print(++i);
        System.out.print(i++);
        System.out.print(i);
    }

    public static void foo3(int num1, int num2){

        if(num1 < num2) {
            System.out.println("num1 less");
        }        
        else {
            System.out.println("num2 less");
        }

        if (num1 == num2){
            System.out.println("num1 == num2");
        }
        else{
            System.out.println("num1 != num2");
        }
    }
    
    public static void foo5(){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number representing a month (1-12): ");
        int month = scan.nextInt();
        
        switch (month) {
        case 1:
            System.out.println("January");
            break;
        case 2:
            System.out.println("February");
            break;
        case 3:
            System.out.println("March");
            break;
        case 4:
            System.out.println("April");
            break;
        case 5:
            System.out.println("May");
            break;
        case 6:
            System.out.println("June");
            break;
        case 7:
            System.out.println("July");
            break;
        case 8:
            System.out.println("August");
            break;
        case 9:
            System.out.println("September");
            break;
        case 10:
            System.out.println("October");
            break;
        case 11:
            System.out.println("November");
            break;
        case 12:
            System.out.println("December");
            break;
        default:
            System.out.println("Invalid month.");
        }
    }

    public static void foo4(){
        Scanner scan = new Scanner(System.in);
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();
        String text = scan.nextLine();
        if (text.contains(word1)){
            System.out.println("before: \n" + text);
            System.out.println("After: \n" + text.replace(word1, word2));
        }
        System.out.println("before: \n" + text);
        System.out.println("After: \n" + text.rep(word1, word2));
        

        scan.close();
    }

    public static void foo6(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = scan.nextInt();
        
        if (100 >= score && score >= 87) {
        System.out.println("A");
        } else if (86 >= score && score >= 80) {
        System.out.println("B");
        } else if (79 >= score && score >= 74) {
        System.out.println("C");
        } else if (73 >= score && score >= 68) {
        System.out.println("D");
        } else if(67 >= score && score >= 61){
        System.out.println("E");
        } else if(60 >= score && score >= 41){
        System.out.println("FX");
        } else{
        System.out.print("F");
        }

        scan.close();
    }

    public static void main(String args[])
    {
        foo4();
    }
}