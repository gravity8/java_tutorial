package chapter3;

import java.util.Scanner;

public class SalesPeoplePayment {
    public static void main(String[] args) {
        int pay = 1000;
        int normalSales = 10;
        System.out.println("How many sales did you have? ");
        Scanner scanner = new Scanner(System.in);
        int employeeSales = scanner.nextInt();
        scanner.close();

        if(employeeSales > normalSales){
            pay+=250;
        }
        System.out.println("Your Salary is: "+ pay);
    }
}
