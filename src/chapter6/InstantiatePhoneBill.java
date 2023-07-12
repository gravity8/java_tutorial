package chapter6;

import java.util.Scanner;

public class InstantiatePhoneBill {

    public static void main(String[] args) {
        System.out.println("Input your id: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        System.out.println("Input the base cost : ");
        double baseCost = scanner.nextDouble();
        System.out.println("Input the allotted time: ");
        int allottedTime = scanner.nextInt();
        System.out.println("Input the minute used: ");
        int minuteUsed = scanner.nextInt();

        PhoneBillCalculatorRedo phoneBill = new PhoneBillCalculatorRedo(id,baseCost,allottedTime,minuteUsed);
        phoneBill.printItemizedBills();
    }
}
