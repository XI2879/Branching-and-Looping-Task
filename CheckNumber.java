package Tasks;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int number = scan.nextInt();
        checkNumber(number);
    }

    public static void checkNumber(int number) {
        if(number>0){
            System.out.println("Number is positive");
        }else if(number<0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is equal to Zero");
        }
    }
}
