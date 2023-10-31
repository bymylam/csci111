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

        int count = 1;
        double min = input.nextDouble();
        double max = min;
        double sum = min;
        while (input.hasNext()) {
            String val = input.next();
            try {
                double valNumber = Double.parseDouble(val);
                // COUNT
                count++;
                // SUM
                sum += valNumber;
                // MIN
                if (min > valNumber) {
                    min = valNumber;
                }
                // MAX
                if (max < valNumber) {
                    max = valNumber;
                }
            } catch (NumberFormatException e) {
                System.out.println("Sorry, this is not a number");
                continue;
            }
        }
        input.close();
//        AVERAGE
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
