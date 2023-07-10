package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println("How many sales did you make?");
        Scanner scanner = new Scanner(System.in);
        int numberOfSales = scanner.nextInt();

        if(numberOfSales>=quota){
            System.out.println("Congratulations you reached the quota");
        }
        else{
            int salesShort = quota - numberOfSales;
            System.out.println("Unfortunately, you could not reach the quota; you have "+salesShort+
                    " sales short");
        }
    }
}
