import java.util.Scanner;
import java.text.NumberFormat; //formart numbers as currency (1)

public class MyLamAssignment4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance(); //(1)

        //Food Menu
        double Pizza = 15;
        String Pizza$ = formatter.format(Pizza); //(1) changing to currency, which also means that it converts to String
        double Salad = 8;
        String Salad$ = formatter.format(Salad); //(1)
        double Sandwich = 9;
        String Sandwich$ = formatter.format(Sandwich); //(1)
        double Pasta = 10;
        String Pasta$ = formatter.format(Pasta); //(1)
        double Soup = 7;
        String Soup$ = formatter.format(Soup); //(1)

        System.out.println("Welcome to the Restaurant");
        System.out.println("Here is our menu:");
        System.out.println("Pizza: " + Pizza$);
        System.out.println("Salad: " + Salad$);
        System.out.println("Sandwich: " + Sandwich$);
        System.out.println("Pasta: " + Pasta$);
        System.out.println("Soup: " + Soup$);

        System.out.println("Which item would you like?");
        String item = scan.nextLine();

        double food_price = 0;
        if (item.equals("Pizza")) {
            food_price += Pizza;
        } else if (item.equals("Salad")) {
            food_price += Salad;
        } else if (item.equals("Sandwich")) {
            food_price += Sandwich;
        } else if (item.equals("Pasta")) {
            food_price += Pasta;
        } else if (item.equals("Soup")) {
            food_price += Soup;
        } else {
            System.out.println("Invalid response, try again later.");
            System.exit(0); //used for quitting the program
        }

        //---------------------------------------------------------------
        //Drink Menu

        double Soda = 2;
        String Soda$ = formatter.format(Soda);
        double Coffee = 3;
        String Coffee$ = formatter.format(Coffee);

        System.out.println("Would you like to add a Soda for $2 or a Coffee for $3?");
        System.out.println("Enter [S] for soda, [C] for coffee or [N] for neither.");
        String drink = scan.next();

        double drink_price = 0;
        if (drink.equals("S")) {
            drink_price += Soda;
        } else if (drink.equals("C")) {
            drink_price += Coffee;
        } else if (drink.equals("N")) {
            drink_price += 0;
        } else {
            System.out.println("Invalid response, try again later.");
            System.exit(0);
        }

        //--------------------------------------------------------------
        //SUBTOTAL
        double Subtotal = food_price + drink_price;
        String Subtotal$ = formatter.format(Subtotal);
        System.out.println("Subtotal: " + Subtotal$);

        //--------------------------------------------------------------
        //TAX
        double tax = Subtotal*0.06;
        String tax$ = formatter.format(tax);
        System.out.println("Tax: " + tax$);

        //--------------------------------------------------------------
        //TOTAL
        double total = Subtotal + tax;
        String total$ = formatter.format(total);
        System.out.println("Tax : " + total$);

    }
}
