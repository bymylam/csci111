import java.io.*;
import java.util.*;

public class MyLamAssignment6 {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("How many random numbers do you want to print out into the file?");
//        int HowManyRand = scan.nextInt();

        //insert random numbers into a file
//        Random rand = new Random();
        String inputName = "input.txt";
//        PrintWriter createInput = new PrintWriter(inputName);
//        for (int i = 1; i <= 10; i++) {
//            int number = rand.nextInt();
//            createInput.println(number);
//        }
//        createInput.close();

        //open file
        File file = new File(inputName);
        Scanner input = new Scanner(file);

        //SUM & COUNT
        int count = 1;
        double min = input.nextDouble();
        double max = min;
        double sum = min;
        double val;
        while (input.hasNextDouble()) {
            val = input.nextDouble();
            //COUNT
            count++;
            //SUM
            sum+=val;
            //MIN
            if (min > val) {
                min = val;
            }
            //MAX
            if (max < val) {
                max = val;
            }
        }

        //AVERAGE
        double average = (double) sum/count;

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
