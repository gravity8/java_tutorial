package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.createRoom();
        Rectangle bathroom = calculator.createRoom();
        double totalArea = calculator.calculateTotalArea(kitchen,bathroom);
        System.out.println("The total area of the two rooms is: "+totalArea);
    }

    public Rectangle createRoom(){
        System.out.println("input the length of the room: ");
        double length = scanner.nextDouble();
        System.out.println("input the width of the room: ");
        double width = scanner.nextDouble();
        return new Rectangle(length,width);
    };

    public double calculateTotalArea(Rectangle room1, Rectangle room2){
        return room1.calculateArea()+room2.calculateArea();
    }
};
