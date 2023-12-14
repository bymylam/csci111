import java.util.*;
import java.io.*;

public class Assignment6 {
    public static void main(String[] args) throws IOException {
        //create an input file
        String fileName = "input.txt";
        PrintWriter inputFile = new PrintWriter(fileName);
        Random rand = new Random();
        for (int i = 0; i<10; i++) {
            inputFile.println(rand.nextDouble());
        }
        inputFile.close();

        //access to the input file again to take the inside data
        File f = new File(fileName);
        Scanner scan = new Scanner(f);

        int count = 0;
        double min = scan.nextDouble();
        double sum = min;
        double max = min;
        double val;
        while (scan.hasNextDouble()) {
            val = scan.nextDouble();
            //count
            count++;
            //sum
            sum += val;
            //min
            if (min < val) {
                min = val;
            }
            //max
            if (max > val) {
                max = val;
            }
        }
        //average
        double average = sum/count;

        //create an output file and print out the result
        PrintWriter outputFile = new PrintWriter("output.txt");
        outputFile.println("Count: " + count);
        outputFile.println("Sum: " + sum);
        outputFile.println("Min: " + min);
        outputFile.println("Max: " + max);
        outputFile.println("Average: " + average);
        outputFile.close();
    }
}
