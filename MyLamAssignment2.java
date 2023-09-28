public class MyLamAssignment2 {
    public static void main(String[] args) {
        char M = 'M';
        char y = 'y';

        System.out.println("Hello, my name is " + M + y + "!");
        System.out.println();

        int classes = 4;
        int commute = 80;
        int J_number = 183;
        double years = 1.0;

        String sentenceOne = "I take " + classes + " this semester at CCP.";
        String sentenceTwo = "My commute is " + commute + " minutes.";
        String sentenceThree = "The last digits of my J-number are " + J_number;
        String sentenceFour = "I've lived in Philadelphia for " + years;

        System.out.println(sentenceOne);
        System.out.println(sentenceTwo);
        System.out.println(sentenceThree);
        System.out.println(sentenceFour);

        double myTestGrade = 87.2; //Error #1
        String grade = "My grade on the test was "; //Error #2
        double myTotalGrade = 89.5; //Error #3
        String totalGradeMessage = "My total grade in the class is "; //Error #4

        System.out.println("Error #1 happened because 87.2 is double, so it must be double primitive data type.");
        System.out.println("Error #2 happened because it did not have a data type at the beginning which was String.");
        System.out.println("Error #3 happened because it did not have a data type at the beginning which was Double.");
        System.out.println("Error #4 happened because it did not have a data type at the beginning which was String");
    }
}