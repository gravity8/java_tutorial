package chapter6;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        /*************
         * Rectangle1
         */
        Rectangle room1 = new Rectangle(10,5);
        double areaOfRoom1 = room1.calculateArea();
        System.out.println("The area of the room1 is: "+areaOfRoom1+"cm^2");
        Rectangle room2 = new Rectangle(12,7);
        double areaOfRoom2 = room2.calculateArea();
        System.out.println("The area of Room2 is: "+areaOfRoom2+"cm^2");

        double totalArea = areaOfRoom1+areaOfRoom2;
        System.out.println("The total area of both Room is: "+ totalArea +"cm^2");

    }
}
