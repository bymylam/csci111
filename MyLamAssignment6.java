import java.io.*;
import java.util.*;

public class MyLamAssignment6 {
    public static void main(String[] args) throws IOException {
        //insert random numbers into a file
        Random rand = new Random();
        String inputName = "input.txt";
        PrintWriter createInput = new PrintWriter(inputName);
        for (int i = 1; i <= 10; i++) {
            int number = rand.nextInt(6);
            createInput.println(number);
        }
        createInput.close();

        //open file
        File file = new File(inputName);
        Scanner input = new Scanner(file);

        //SUM & COUNT
        int count = 0;
        int sum = 0;
        while (input.hasNextInt()) {
            count++;
            double x = input.nextInt();
            sum += x;
        }

        //MIN & MAX
        int val  = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (input.hasNextInt()) {
            val = input.nextInt();
            if (val > max) { //max
                max = val;
            }
            if (val < min) { //min
                min = val;
            }
        }

        //AVERAGE
        double average = sum/count;

        String outputName = "output.txt";
        PrintWriter createOutput = new PrintWriter(outputName);
        createOutput.println("Min: " + min);
        createOutput.println("Max: " + max);
        createOutput.println("Sum: " + sum);
        createOutput.println("Count: " + count);
        createOutput.println("Average: " + average);
        createOutput.close();

    }
}