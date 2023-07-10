package chapter4;

import java.util.Scanner;

public class SearchLetter {
    public static void main(String[] args){
        System.out.println("input a text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next().toUpperCase();
        System.out.println("input a Character to search for: ");
        char letter = scanner.next().toUpperCase().charAt(0);

        boolean letterFound=false;

        for(char i=0; i<text.length();i++){
            char currentLetter = text.charAt(i);
            System.out.println(letter+" "+currentLetter);
            if (currentLetter==letter) {
                letterFound = true;
                break;
            }
        }
        if(letterFound){
            System.out.println("letter "+letter+" was found in the given text");
        }
        else{
            System.out.println("letter "+letter+" was not found in the text");
        }
    }
}
