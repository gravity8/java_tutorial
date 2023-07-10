package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    static double chargePerOverage = 0.25;
    static double taxPercentage = 0.15;
    public static void main(String[] args) {
        //ask for the plan fee
        System.out.println("Input your plan fee: ");
        Scanner scanner =new Scanner(System.in);
        double planFees = scanner.nextDouble();
        //ask for the overage minutes
        System.out.println("Input the overage minutes");
        double overageMinutes = scanner.nextDouble();
        double overageFees = CalculateOverageFees(overageMinutes,chargePerOverage);
        double subTotal = overageFees +planFees;
        double tax = CalculateTax(subTotal, taxPercentage);
        double total = CalculateFinal(tax,subTotal);
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: "+ planFees);
        System.out.println("Overage: "+ overageMinutes);
        System.out.println("Tax: "+ tax);
        System.out.println("Total: "+ total);
    }
    public static double CalculateOverageFees(double overageMinutes, double chargePerOverage){
        return overageMinutes*chargePerOverage;
    }
    public static double CalculateTax(double subTotal, double taxPercentage){
        return subTotal*taxPercentage;
    }
    public static double CalculateFinal(double tax, double subTotal){
        return tax+subTotal;
    }


}
