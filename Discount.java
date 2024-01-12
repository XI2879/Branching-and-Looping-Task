package Tasks;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the purchase amount: ");
        double purchaseAmount = scan.nextDouble();
        findFinalPay(purchaseAmount);
    }

    private static void findFinalPay(double purchaseAmount) {
        Double finalPayAmount =0.0;
        if(purchaseAmount <500){
            finalPayAmount= purchaseAmount;
        } else if (purchaseAmount >=500 && purchaseAmount <=1000) {
            finalPayAmount = purchaseAmount *0.9;
        }else{
            finalPayAmount = purchaseAmount *0.8;
        }
        System.out.println(finalPayAmount);
    }

}
