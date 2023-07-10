package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        //Get the number of hours the Employee worked;
        System.out.println("Enter Employee's work hour: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //Get the Employee's rate
        System.out.println("Enter Employee's rate per hour");
        double rate = scanner.nextDouble();
        scanner.close();

        //Multiply the Employee's rate and work hours
        double grossPay = rate*hours;

        //print out the gross pay
        System.out.println("The Employees gross pay is $"+grossPay);

    }
}
