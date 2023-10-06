import java.util.Scanner;
import java.text.NumberFormat;

public class MyLamAssignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

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

        System.out.println("*****                   *****");
        System.out.println("  Welcome to the Restaurant  ");
        System.out.println("       Here is our menu:     ");
        System.out.println("_____________________________");
        System.out.println("|           FOOD            |");
        System.out.println("| Pizza.............." + Pizza$ + " |");
        System.out.println("| Salad..............." + Salad$ + " |");
        System.out.println("| Sandwich............" + Sandwich$ + " |");
        System.out.println("| Pasta.............." + Pasta$ + " |");
        System.out.println("| Soup................" + Soup$ + " |");
        System.out.println("|___________________________|");

        //-------------------------------------------------------------------------------
        double Subtotal = 0;

        //Food Menu
        System.out.println("What food would you like to order?");
        String menuItem = input.next();
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
        System.out.println("Would you like anything else? Enter [Y] for yes or [N] for no.");
        String response_for_food = input.next();
        while (response_for_food.equalsIgnoreCase("Y")) {
            System.out.println("What food would you like to order?");
            menuItem = input.next();
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
            System.out.println("Would you like anything else? Enter [Y] for yes or [N] for no.");
            response_for_food = input.next();
        }

        //------------------------------------------------------------------------------------
        //Drink Menu
        //variables
        double Soda = 2;
        String Soda$ = formatter.format(Soda);
        double Coffee = 3;
        String Coffee$ = formatter.format(Coffee);
        double BubbleTea = 6;
        String BubbleTea$ = formatter.format(BubbleTea);
        //Toppings for bubble tea
        double boba = 1;
        String boba$ = formatter.format(boba);
        double pudding = 1;
        String pudding$ = formatter.format(pudding);

        System.out.println("_____________________________");
        System.out.println("|           DRINK           |");
        System.out.println("| Soda................" + Soda$ + " |");
        System.out.println("| Coffee.............." + Coffee$ + " |");
        System.out.println("| BubbleTea..........." + BubbleTea$ + " |");
        System.out.println("|___________________________|");
        System.out.println("|  TOPPINGS FOR BUBBLE TEA  |");
        System.out.println("| boba, pudding.......$1.00 |");
        System.out.println("|___________________________|");

        System.out.println("What about the drink? What would you like?");
        String drink = input.next();
        switch (drink) {
            case "Soda":
                Subtotal += Soda;
                break;
            case "Coffee":
                Subtotal += Coffee;
                break;
            case "BubbleTea":
                Subtotal += BubbleTea;
                System.out.println("Would you like to add any toppings? [Y] or [N]");
                String toppings_yn = input.next();
                if (toppings_yn.equalsIgnoreCase("Y")) {
                    System.out.println("We have [Boba] or [Pudding], what would you like?");
                    String toppings_answer = input.next();
                    if (toppings_answer.equalsIgnoreCase("Boba")) {
                        Subtotal += boba;
                    } else if (toppings_answer.equalsIgnoreCase("Pudding")) {
                        Subtotal += pudding;
                    } else {
                        System.out.println("Sorry, we don't have that");
                    }
                }
                break;
            default:
                System.out.println("Invalid response, try again later.");
        }
        System.out.println("Anything else? [Y] for yes or [N] for no.");
        String response_drink = input.next();
        while (response_drink.equalsIgnoreCase("Y")) {
            System.out.println("So, what drink would you like?");
            drink = input.next();
            switch (drink) {
                case "Soda":
                    Subtotal += Soda;
                    break;
                case "Coffee":
                    Subtotal += Coffee;
                    break;
                case "BubbleTea":
                    Subtotal += BubbleTea;
                    System.out.println("Would you like to add any toppings? [Y] or [N]");
                    String toppings_yn = input.next();
                    if (toppings_yn.equalsIgnoreCase("Y")) {
                        System.out.println("We have [Boba] or [Pudding], what would you like?");
                        String toppings_answer = input.next();
                        if (toppings_answer.equalsIgnoreCase("Boba")) {
                            Subtotal += boba;
                        } else if (toppings_answer.equalsIgnoreCase("Pudding")) {
                            Subtotal += pudding;
                        } else {
                            System.out.println("Sorry, we don't have that");
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid response, try again later.");
            }
            System.out.println("Anything else? Enter [Y] for yes or [N] for no.");
            response_drink = input.next();
        }

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
