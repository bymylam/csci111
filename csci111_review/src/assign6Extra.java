import java.util.*;
import java.io.*;

public class assign6Extra {
    public static void main(String[] args) throws IOException {
        //create an input file
        String fileName = "input.txt";
        PrintWriter inputFile = new PrintWriter(fileName);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            inputFile.println(rand.nextInt(10));
        }
        inputFile.close();

        //access to the input file again to take the inside data
        File f = new File(fileName);
        Scanner scan = new Scanner(f);

        int[] arr = new int[10];
        int sum = 0;
        int val;
        while (scan.hasNextInt()) {
            for (int i = 0; i < 10; i++) {
                arr[i] = scan.nextInt();
                //sum
                sum+=arr[i];
            }
            //count
            System.out.println("Count: " + arr.length);
            //sum
            System.out.println("Sum: " + sum);
        }
    }
}