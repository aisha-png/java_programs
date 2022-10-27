package shapeAreaAndPermiter;

import java.util.Scanner;

public class AreaOfShapes {

//    way to write methods for calculating area of shapes - will not be using these in the switch/case
    static double areaOfCircle(double r){                 //area of a circle
        return (22*r*r)/7;
    }
    static double areaOfTriangle(double length, double width){       //area of a triangle
        return length*width/2;
    }
    static double areaOfRectangle(double length, double width){     // area of a rectangle
        return length*width;
    }
    static double areaOfSquare(double length){               //area of a square
        return length*length;
    }

    static void printHelp(){
        String instruction = "" + System.lineSeparator() +
                "  1) Calculate the area of a Circle?" + System.lineSeparator() +
                "  2) Calculate the area of a Triangle?" + System.lineSeparator() +
                "  3) Calculate the area of a Rectangle?" + System.lineSeparator() +
                "  4) Calculate the area of a Square?" + System.lineSeparator() +
                "  5) Nothing :| " + System.lineSeparator() +
                "----------------------------------------------" + System.lineSeparator() +
                "----------------------------------------------";
        System.out.println(instruction);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the number of the shape you want to calculate the area for:");
        int option = scanner.nextInt();
        switch(option){
            case 1:
                System.out.println("Enter the radius: ");
                double radius = scanner.nextDouble();
                double area = (22*radius*radius)/7;
                System.out.println("The area of your circle is : " + area);
                break;
            case 2:
                System.out.println("Enter the base of the triangle:");
                double triBase = scanner.nextDouble();
                System.out.println("Enter the height of the triangle:");
                double triHeight = scanner.nextDouble();
                double areaOfTriangle = (triHeight*triBase)/2;
                System.out.println("The area of your triangle is " + areaOfTriangle );
                break;
            case 3:
                System.out.println("Enter the width of the rectangle: ");
                double recLength = scanner.nextDouble();
                System.out.println("Enter the height of the rectangle: ");
                double recHeight = scanner.nextDouble();
                double areaOfRectangle = recHeight*recLength;
                System.out.println("The area of the rectangle is " + areaOfRectangle);

            case 4:
                System.out.println("Enter the length of the square: ");
                double squLength = scanner.nextDouble();
                double areaOfSquare = squLength*squLength;
                System.out.println("The area of the square is " + areaOfSquare);
                break;
            case 5:
                System.out.println("You selected 5, the cli will terminate. Thank you!");
                break;

        }
    }

}
