/*
Given the following information, implement a full complete Java method.
Do not write a complete program, ONLY the method.

Write a method called createFile.:

Return type: void
This method takes no arguments
This method should print to a file named "outputFEQ5.txt"
This method should ask the user for words, and print them directly to the file.
    It should continue asking until the user enters "quit"
This method should not use Arrays or ArrayLists.
Include any import statements you may need, and handle any exceptions.
 */
import java.util.*;
import java.io.*;

public class FEQ5 {
    public static void main(String[] args) throws IOException {
        createFile();
    }
    //complete the program here
//    public static void createFile() throws IOException {
//        Scanner scan = new Scanner(System.in);
//        PrintWriter outputFile = new PrintWriter("outputFEQ5.txt");
//        String response;
//        do {
//            System.out.println("Enter a word: ");
//            System.out.println("Enter 'quit' to exit.");
//            response = scan.next();
//            outputFile.println(response);
//        } while (! response.equalsIgnoreCase("quit"));
//        outputFile.close();
//    }

    public static void createFile() throws IOException {
        Scanner scan = new Scanner(System.in);
        PrintWriter printer = new PrintWriter("outputFEQ5.txt");
        System.out.println("Enter a word. Enter 'quit' to exit.");
        String word = scan.next();

        while(! word.equals("quit")) {
            printer.println(word);
            System.out.println("Enter a word. Enter 'quit' to exit.");
            word = scan.next();
        }

        printer.close();
    }
}
