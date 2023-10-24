import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter output = new PrintWriter("example.txt");
        output.println("This is a new file.");
        output.println("It has two lines of text.");
        output.close();
    }
}