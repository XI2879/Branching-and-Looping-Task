package Tasks;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        // created array with 3 boxes
        int[] arr = new int[3];
        findSmallest(arr, scan);
    }

    private static void findSmallest(int[] arr, Scanner scan) {
        // storing numbers in array
        for (int i = 0; i < 3; i++) {
            arr[i]= scan.nextInt();
        }
        int smallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            if(arr[i]<smallestNumber){
                smallestNumber= arr[i];
            }
        }
        System.out.println(smallestNumber);
    }
}
