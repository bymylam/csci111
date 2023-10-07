import java.util.Scanner;
import java.text.NumberFormat;

public class MyLamAssignment5 {

    public static void showMenu(Boolean foodMenu, String arg1$, String arg2$, String arg3$, String arg4$, String arg5$) {
        if (foodMenu) {
            System.out.println("*****                   *****");
            System.out.println("  Welcome to the Restaurant  ");
            System.out.println("       Here is our menu:     ");
            System.out.println("_____________________________");
            System.out.println("|           FOOD            |");
            System.out.println("| Pizza.............." + arg1$ + " |");
            System.out.println("| Salad..............." + arg2$ + " |");
            System.out.println("| Sandwich............" + arg3$ + " |");
            System.out.println("| Pasta.............." + arg4$ + " |");
            System.out.println("| Soup................" + arg5$ + " |");
            System.out.println("|___________________________|");
        } else {
            System.out.println("_____________________________");
            System.out.println("|           DRINK           |");
            System.out.println("| Soda................" + arg1$ + " |");
            System.out.println("| Coffee.............." + arg2$ + " |");
            System.out.println("| BubbleTea..........." + arg3$ + " |");
            System.out.println("|___________________________|");
            System.out.println("|  TOPPINGS FOR BUBBLE TEA  |");
            System.out.println("| Boba, Pudding ......." + arg4$ + " |");
            System.out.println("|___________________________|");
        }

    }

    public static double foodMenu(Scanner input, double Subtotal, double Pizza, double Salad, double Sandwich, double Pasta, double Soup) {
        System.out.println("What food would you like to order?");
        String response_for_food = "Y";
        while (response_for_food.equalsIgnoreCase("Y")) {
            if (response_for_food.equalsIgnoreCase("N")) {
                break;
            }
            String menuItem = input.nextLine();
            switch (menuItem) {
                case "Pizza":
                    Subtotal += Pizza;
                    break;
                case "Salad":
                    Subtotal += Salad;
                    break;
                case "Sandwich":
                    Subtotal += Sandwich;
                    break;
                case "Pasta":
                    Subtotal += Pasta;
                    break;
                case "Soup":
                    Subtotal += Soup;
                    break;
                default:
                    System.out.println("Invalid response, try again later.");
            }
            System.out.println("Current total price: " + Subtotal);
            System.out.println("Would you like anything else? Enter [Y] for yes or [N] for no.");
            response_for_food = input.nextLine();
        }
        return Subtotal;
    }

    public static double drinkMenu(Scanner input, double Subtotal, double Soda, double Coffee, double BubbleTea, double Boba, double Pudding) {
        System.out.println("What about the drink? What would you like?");
        String response_for_food;
        do {
            String drink = input.nextLine().trim();
            switch (drink) {
                case "Soda":
                    Subtotal += Soda;
                    break;
                case "Coffee":
                    Subtotal += Coffee;
                    break;
                case "BubbleTea":
                case "Bubble Tea":
                    Subtotal += BubbleTea;
                    System.out.println("Would you like to add any toppings? [Y] or [N]");
                    String toppings_yn = input.nextLine();
                    if (toppings_yn.equalsIgnoreCase("Y")) {
                        System.out.println("We have [Boba] or [Pudding], what would you like?");
                        String toppings_answer = input.nextLine();
                        if (toppings_answer.equalsIgnoreCase("Boba")) {
                            Subtotal += Boba;
                        } else if (toppings_answer.equalsIgnoreCase("Pudding")) {
                            Subtotal += Pudding;
                        } else {
                            System.out.println("Sorry, we don't have that");
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid response, try again later.");
            }
            System.out.println("Current total price: " + Subtotal);
            System.out.println("Would you like anything else? Enter [Y] for yes or [N] for no.");
            response_for_food = input.nextLine();
        } while (response_for_food.equalsIgnoreCase("Y"));
        return Subtotal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        double Subtotal = 0;

        //------------------------------------------------------------------------------------
        //Food Menu
        double Pizza = 15;
        String Pizza$ = formatter.format(Pizza);
        double Salad = 8;
        String Salad$ = formatter.format(Salad);
        double Sandwich = 9;
        String Sandwich$ = formatter.format(Sandwich);
        double Pasta = 10;
        String Pasta$ = formatter.format(Pasta);
        double Soup = 7;
        String Soup$ = formatter.format(Soup);

        showMenu(true, Pizza$, Salad$, Sandwich$, Pasta$, Soup$);

        //Total food
        Subtotal = foodMenu(input, Subtotal, Pizza, Salad, Sandwich, Pasta, Soup);

        //------------------------------------------------------------------------------------
        //Drink Menu
        double Soda = 2;
        String Soda$ = formatter.format(Soda);
        double Coffee = 3;
        String Coffee$ = formatter.format(Coffee);
        double BubbleTea = 6;
        String BubbleTea$ = formatter.format(BubbleTea);
        //Toppings for bubble tea
        double Boba = 1;
        String Boba$ = formatter.format(Boba);
        double Pudding = 1;
        String Pudding$ = formatter.format(Pudding);

        showMenu(false, Soda$, Coffee$, BubbleTea$, Boba$, Pudding$);

        //Total drink
        Subtotal = drinkMenu(input, Subtotal, Soda, Coffee, BubbleTea, Boba, Pudding);

        //-----------------------------------------------------------------------------------
        System.out.println("-----------------------------------------");
        //SUBTOTAL
        String Subtotal$ = formatter.format(Subtotal);
        System.out.println("Subtotal: " + Subtotal$);

        //TAX
        double tax = Subtotal*0.06;
        String tax$ = formatter.format(tax);
        System.out.println("Tax: " + tax$);

        //TOTAL
        double total = Subtotal + tax;
        String total$ = formatter.format(total);
        System.out.println("Tax : " + total$);

        System.out.println("-----------------------------------------");
        System.out.println("Thank you for using our service.");
        System.out.println("Have a good day! :))");
    }
}
