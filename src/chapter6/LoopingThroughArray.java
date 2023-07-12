package chapter6;

import java.util.Scanner;

public class LoopingThroughArray {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] a = s.toCharArray();
        System.out.println("Enter a character to work on");
        char d = scanner.next().charAt(0);

        for (int i = 0; i <= s.length(); i++) {
            if (a[i] == d) {
                if (d >= 'a' && d <= 'z'){
                    d -= 32;
                }
                else if (d >= 'A' && d <= 'Z'){
                    d += 32;
                }
                a[i] = d; break;
            }
            
        }
        s = String.valueOf(a);
        System.out.println(s);
    }
}
