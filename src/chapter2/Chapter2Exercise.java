package chapter2;

import java.text.MessageFormat;
import java.util.Scanner;

public class Chapter2Exercise {
    public static void main(String[] args) {
        //Get the Adjective from the user
        System.out.println("Enter an Adjective");
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.next();
        // Get the Season of the year
        System.out.println("Enter the Season of the year");
        String seasonOfTheYear = scanner.next();
        //Get the Whole number
        System.out.println("Enter an Whole number");
        int wholeNumber = scanner.nextInt();
        scanner.close();
        //Concatenate the parts of the sentence
        String sentence = MessageFormat.format("on a {0} {1} day, I drink minimum of {3} cups " +
                "of coffee",adjective,seasonOfTheYear,wholeNumber);
        //print the output
        System.out.println(sentence);
    }
}
