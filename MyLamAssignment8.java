import java.io.*;
import java.util.*;

public class MyLamAssignment8 {
    public static void main(String[] arggs) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What type of shape would you like the area of?");
        System.out.println("Options: Rectangle, Triangle, Circle");
        String response = scan.nextLine();
        if (response.equalsIgnoreCase("Rectangle")) {
            System.out.println("The area of the rectangle is " + rectangleArea());
        } else if (response.equalsIgnoreCase("Triangle")) {
            System.out.println("The area of the triangle is " + triangleArea());
        } else if (response.equalsIgnoreCase("Circle"));
            System.out.println("The area of the circle is " + circleArea());
    }

    //RECTANGLE
    public static double rectangleArea() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter the rectangle height: ");
        double height = scan1.nextDouble();
        System.out.println("Please enter the rectangle width: ");
        double width = scan1.nextDouble();

        //Rectangle Area
        double result = height*width;
        return result;

    }

    //TRIANGLE
    public static double triangleArea() {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter the triangle height: ");
        double height = scan2.nextDouble();
        System.out.println("Please enter the triangle width: ");
        double width = scan2.nextDouble();

        //Triangle Area
        double result = (height*width)/2;
        return result;
    }

    //CIRCLE
    public static double circleArea() {
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Please enter the circle radius: ");
        double radius = scan3.nextDouble();

        //Circle Area
        double result = Math.PI*radius*radius;
        return result;
    }
}