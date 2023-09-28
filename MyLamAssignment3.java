import java.util.Scanner;

public class MyLamAssignment3 {
    public static void main(String[] args) {
        System.out.println("Hello. Let's calculate your total grade for CSCI111.");
        System.out.println("Enter homework grades as 0, 1 or 2");
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("What was your grade for Assignment 1? ");
        int a1 = input.nextInt();
        System.out.println();

        System.out.print("What was your grade for Assignment 2? ");
        int a2 = input.nextInt();
        System.out.println();

        System.out.print("What was your grade for Assignment 3? ");
        int a3 = input.nextInt();
        System.out.println();

        System.out.print("What was your grade for Assignment 4? ");
        int a4 = input.nextInt();
        System.out.println();

        System.out.print("What was your grade for Assignment 5? ");
        int a5 = input.nextInt();
        System.out.println();

        System.out.print("What was your grade for Assignment 6? ");
        int a6 = input.nextInt();
        System.out.println();

        System.out.print("What was your grade for Assignment 7? ");
        int a7 = input.nextInt();
        System.out.println();

        System.out.print("What was your grade for Assignment 8? ");
        int a8 = input.nextInt();
        System.out.println();

        System.out.print("What was your grade for Assignment 9? ");
        int a9 = input.nextInt();
        System.out.println();

        System.out.print("What was your grade for Assignment 10? ");
        int a10 = input.nextInt();
        System.out.println();

        //---------------------------------------------------
        System.out.println("Enter Midterm and Final Eam grades as a percentage.");
        System.out.println("For example, if you received an 85% then enter 0.85");
        System.out.println();

        System.out.print("What was your grade for Midterm 1? ");
        double midterm1 = input.nextDouble();
        System.out.println();

        System.out.print("What was your grade for Midterm 2? ");
        double midterm2 = input.nextDouble();
        System.out.println();

        System.out.print("What was your grade for the Final Exam? ");
        double final_exam = input.nextDouble();
        System.out.println();

        //double assignments_average = (a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10)/20.0;
        double assignment_average = ((a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10)/20.0)*0.2;
        double m1 = 0.25*midterm1;
        double m2 = 0.25*midterm2;
        double f = 0.3*final_exam;

        //(0.2*assignments_average)  +  (0.25*midterm1)  +  (0.25*midterm2)  +  (0.3*final_exam);
        double result = assignment_average + m1 + m2 + f;
        System.out.println("Your grade for the course was " + result);


    }
}
