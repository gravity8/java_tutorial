package chapter6;

import java.util.Scanner;

public class PhoneBillCalculatorRedo {

    private int id;
    private double baseCost;
    private int allottedTime;
    private int minuteUsed;
    Scanner scanner = new Scanner(System.in);
    public PhoneBillCalculatorRedo(){
        id =0;
        baseCost=0.00;
        allottedTime = 0;
        minuteUsed =0;
    }
    public PhoneBillCalculatorRedo(int id, double baseCost, int allottedTime, int minuteUsed){
        this.id = id;
        this.baseCost=baseCost;
        this.allottedTime = allottedTime;
        this.minuteUsed = minuteUsed;
    }
    public PhoneBillCalculatorRedo(int id){
        this.id = id;
        baseCost=0.00;
        allottedTime = 0;
        minuteUsed =0;
    }

    public double calculateOverageFee(){
        if(minuteUsed>allottedTime){
            int overageMinutes = minuteUsed-allottedTime;
            double overageFee = 0.25;
            double overage = overageMinutes*overageFee;
            return  overage;
        }
        else{
            return 0.00;
        }
    }
    public double CalculateTax(){
        double overage= calculateOverageFee();
        double subTotal = overage + baseCost;
        double taxPercentage = 0.15;
        return subTotal*taxPercentage;
    }
    public double CalculateFinal(){
        double tax = CalculateTax();
        double overage= calculateOverageFee();
        double subTotal = overage + baseCost;
        return tax+subTotal;
    }
    public double roundOff(double value){
        return Math.round(value * 100.0) / 100.0;
    }
    public void printItemizedBills(){
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: "+ baseCost);
        double overage= roundOff(calculateOverageFee());
        System.out.println("Overage: "+ overage);
        double tax = roundOff(CalculateTax());
        System.out.println("Tax: "+ tax );
        double total = roundOff(CalculateFinal()) ;
        System.out.println("Total: "+ total);
    }
}
