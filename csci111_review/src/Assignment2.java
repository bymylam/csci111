public class Assignment2 {
    public static void main(String[] args) {
        char m = 'M';
        char y = 'Y';
        String intro = "Hello, my name is " + m + y + "!";
        System.out.println(intro);
        System.out.println();

        //question 6
        int classes = 4;
        int commute = 60;
        int jNum = 183;
        double year = 0.4;
        //extra for year
        //in case that a person just lives there less than a year, using if-else
        String yearOrYears;
        if (year <= 1) {
            yearOrYears = " year.";
        } else { yearOrYears = "years."; }

        System.out.println("I take " + classes + " classes this semester at CCP.");
        System.out.println("My commute is " + commute + " minutes.");
        System.out.println("The last 3 digits of my J-Number are " + jNum + ".");
        System.out.println("I have lived near Philadelphia for " + year + yearOrYears);
    }
}
