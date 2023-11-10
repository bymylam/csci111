import java.util.*;
import java.io.*;

public class MyLamAssignment8 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        String conResponse;

        //print out into the file
        String outputName = "output.txt";
        PrintWriter createOutput = new PrintWriter(outputName);

        //while loops is used for continuing asking
        do {
            System.out.println("What type of shape would you like the area of?");
            System.out.println("Options: Rectangle, Triangle, Circle");
            String shape = scan.nextLine();
            //print out into the file txt
            createOutput.println("The chosen shape is " + shape);
            if (shape.equalsIgnoreCase("Rectangle")) {
                double answer = rectangleArea(height(),width());
                //print out into the file txt
                createOutput.println("The area of the rectangle is " + answer);
            } else if (shape.equalsIgnoreCase("Triangle")) {
                double answer = triangleArea(height(),width());
                //print out into the file txt
                createOutput.println("The area of the triangle is " + answer);
            } else if (shape.equalsIgnoreCase("Circle")) {
                double answer = circleArea(radius());
                //print out into the file txt
                createOutput.println("The area of the circle is " + answer);
            }
            System.out.println("Is there any shape would you like the area of?");
            System.out.println("[YES] or [NO]");
            conResponse = scan.nextLine();
        } while (conResponse.equalsIgnoreCase("Yes"));

        //close the file txt
        createOutput.close();
    }


    //height
    public static double height() {
        Scanner h = new Scanner(System.in);
        System.out.println("Please enter the height of the shape: ");
        double height = h.nextDouble();
        return height;
    }

    //width
    public static double width() {
        Scanner w = new Scanner(System.in);
        System.out.println("Please enter the width of the shape: ");
        double width = w.nextDouble();
        return width;
    }

    //radius
    public static double radius() {
        Scanner r = new Scanner(System.in);
        System.out.println("Please enter the radius: ");
        double radius = r.nextDouble();
        return radius;
    }

    //RECTANGLE AREA
    public static double rectangleArea(double height, double width) {
        double result = height*width;
        return result;
    }

    //TRIANGLE AREA
    public static double triangleArea(double height, double width) {
        double result = (height*width)/2;
        return result;
    }

    //CIRCLE AREA
    public static double circleArea(double radius) {
        double result = Math.PI*radius*radius;
        return result;
    }
}
