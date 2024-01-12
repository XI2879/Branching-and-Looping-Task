package Tasks;

import java.util.Scanner;

public class ReverseNumber {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();
//        for (int i = input.length()-1; i >=0 ; i--) {
//            System.out.print(input.charAt(i));
//
//        }
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        reverseNum(num);
    }

    private static void reverseNum(int num) {
        int reverseNumber = 0;
        while(num != 0){
            int digit = num % 10;
            reverseNumber = reverseNumber * 10 + digit;
            num /= 10;
        }
        System.out.println(reverseNumber);
    }
}
