import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello. Let’s calculate your total grade for CSCI111.");
        System.out.println("Enter homework grades as 0, 1 or 2");
        System.out.println();

        //assignments
        int assignmentGrade = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("What was your grade for Assignment " + i + "?");
            System.out.println();
            int response = scan.nextInt();
            assignmentGrade += response;
        }

        System.out.println("Enter Midterm and Final Exam grades as a percentage.");
        System.out.println("For example, if you received an 85% then enter 0.85.");
        System.out.println();

        //midterm
        double midtermGrade = 0;
        for (int i = 1; i <= 2; i++) {
            System.out.println("What was your grade for Midterm " + i + "?");
            System.out.println();
            double responseMidterm = scan.nextDouble();
            midtermGrade += responseMidterm;
        }

        //final exam
        System.out.println("What was your grade for the Final Exam?");
        System.out.println();
        double finalAverage = scan.nextDouble();

        //final grade
        double finalGrade = 0.2*(assignmentGrade/20.0) + 0.25*midtermGrade + 0.3*finalAverage;
        System.out.println("Your grade for the course was " + finalGrade);
    }
}
