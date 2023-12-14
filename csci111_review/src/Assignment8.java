import java.util.*;
import java.io.*;

public class Assignment8 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        //create an output file to print out the result
        String fileName = "area.txt";
        PrintWriter inputFile = new PrintWriter(fileName);

        //add do while loop for ask the user again
        String anotherRes;
        do {
            System.out.println();
            System.out.println("What type pf shape would you like the are of?");
            System.out.println("Options: Rectangle, Triangle, Circle");
            String response = scan.nextLine();

            if (response.equalsIgnoreCase("Rectangle")) {
                double h = height();
                double w = width();
                System.out.println("The area of rectangle is " + rectangleArea(h, w));

                //print out to the area.txt
                inputFile.println("The entered height: " + h);
                inputFile.println("The entered width: " + w);
                inputFile.println("The area of rectangle: " + rectangleArea(h, w));
            } else if (response.equalsIgnoreCase("Triangle")) {
                double h = height();
                double w = width();
                System.out.println("The area of triangle is " + rectangleArea(h, w));

                //print out to the area.txt
                inputFile.println("The entered height: " + h);
                inputFile.println("The entered width: " + w);
                inputFile.println("The area of triangle: " + triangleArea(h, w));
            } else if (response.equalsIgnoreCase("Circle")) {
                double r = radius();
                System.out.println("The area of circle is " + circleArea(r));

                //print out to the area.txt
                inputFile.println("The entered radius: " + r);
                inputFile.println("The area of circle: " + circleArea(r));
            }

            System.out.println();
            System.out.println("Would you like to perform another calculation?");
            System.out.println("Options: Yes or No");

            //specify another calculation in the area.txt
            anotherRes = scan.nextLine();
            if (anotherRes.equalsIgnoreCase("Yes")) {
                inputFile.println();
                inputFile.println("*****ANOTHER AREA CALCULATION*****");
            }

        } while (anotherRes.equalsIgnoreCase("Yes"));

        inputFile.close();
    }

    //height
    public static double height() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the height: ");
        double h = scan.nextDouble();
        return h;
    }
    //width
    public static double width() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the width: ");
        double w = scan.nextDouble();
        return w;
    }
    //radius
    public static double radius() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the radius: ");
        double r = scan.nextDouble();
        return r;
    }

    //AREA CALCULATION
    //rectangle area
    public static double rectangleArea(double height, double width) {
        return height*width;
    }
    //triangle area
    public static double triangleArea(double height, double width) {
        return (height*width)/2;
    }
    //circle area
    public static double circleArea(double radius) {
        return Math.PI*radius*radius;
    }
}
