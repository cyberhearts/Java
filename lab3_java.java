import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class lab3_java {
    public static void FillParticipants() {
        Scanner input = new Scanner(System.in);

        // get the number of participants from the user
        System.out.print("Enter the number of participants: ");
        int numParticipants = input.nextInt();

        // create arrays to store the names and times of each participant
        String[] names = new String[numParticipants];
        int[] times = new int[numParticipants];

        // prompt the user to enter the names and times of each participant
        for (int i = 0; i < numParticipants; i++) {
            System.out.print("Enter the name of participant " + (i+1) + ": ");
            names[i] = input.next();
            System.out.print("Enter the time for which " + names[i] + " ran the marathon (in minutes): ");
            times[i] = input.nextInt();
        }

        // find the fastest three times
        int[] fastestTimes = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        for (int i = 0; i < times.length; i++) {
            if (times[i] < fastestTimes[0]) {
                fastestTimes[2] = fastestTimes[1];
                fastestTimes[1] = fastestTimes[0];
                fastestTimes[0] = times[i];
            } else if (times[i] < fastestTimes[1]) {
                fastestTimes[2] = fastestTimes[1];
                fastestTimes[1] = times[i];
            } else if (times[i] < fastestTimes[2]) {
                fastestTimes[2] = times[i];
            }
        }

        // find the names of the runners with the fastest times
        String[] fastestNames = new String[3];
        for (int i = 0; i < times.length; i++) {
            if (times[i] == fastestTimes[0]) {
                fastestNames[0] = names[i];
            } else if (times[i] == fastestTimes[1]) {
                fastestNames[1] = names[i];
            } else if (times[i] == fastestTimes[2]) {
                fastestNames[2] = names[i];
            }
        }

        // display the results
        System.out.println("Top three runners:");
        System.out.println("1. " + fastestNames[0] + " - " + fastestTimes[0] + " minutes");
        System.out.println("2. " + fastestNames[1] + " - " + fastestTimes[1] + " minutes");
        System.out.println("3. " + fastestNames[2] + " - " + fastestTimes[2] + " minutes");

        input.close();
    }
    

    public static void task2(int len){
        int[] temp = new int[len];
        temp[0] = 1;
        temp[temp.length-1] = 1;
        for (int i : temp) {
            System.out.println(i);
        }
    }

    public static void task3(){
        int[] arr = {3, 6, 9, 30, 54, 31, 60};
        int ind = 0;
        for (int i : arr) {
            if(i % 3 == 0 && ind < i){
                ind = i;
            }
        }
        System.out.println(ind);
    }

    public static void task4() {
        int[] arr = {1,2,3,4,5,5,5,5,6, 5, 10};
        Set<Integer> set = new HashSet<Integer>();
        for (Integer integer : arr) {
            set.add(integer);
        }
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }

    public static void task5(int value){
        int sum = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int el : arr) {
            sum += el;
        }

        for (int i : arr) {
            System.out.print(i);
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > value){
                arr[i] = sum/arr.length;
            }
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i);
        }

    }

    
    public static void main(String args[]){
        FillParticipants();
    }
}
