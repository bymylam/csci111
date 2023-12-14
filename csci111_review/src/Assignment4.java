import java.util.Scanner;
import java.text.NumberFormat;

public class Assignment4 {
    public static void main(String[] args) {
        //format numbers as currency
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        //food menu
        Double pizza = 15.00;
        Double salad = 8.00;
        Double sandwich = 9.00;
        Double pasta = 10.00;
        Double soup = 7.00;

        System.out.println("Welcome to the Restaurant!");
        System.out.println("Here is our menu: ");
        System.out.println("Pizza: " + formatter.format(pizza));
        System.out.println("Salad: " + formatter.format(salad));
        System.out.println("Sandwich: " + formatter.format(sandwich));
        System.out.println("Past: " + formatter.format(pasta));
        System.out.println("Soup: " + formatter.format(soup));

        Scanner scan = new Scanner(System.in);

        double subtotal = 0;
        String anotherItem;
        do {
            System.out.println("Which item would you like?");
            String itemRes = scan.next();

            if (itemRes.equalsIgnoreCase("pizza")) {
                subtotal += pizza;
            } else if (itemRes.equalsIgnoreCase("salad")) {
                subtotal += salad;
            } else if (itemRes.equalsIgnoreCase("sandwich")) {
                subtotal += sandwich;
            } else if (itemRes.equalsIgnoreCase("pasta")) {
                subtotal += pasta;
            } else if (itemRes.equalsIgnoreCase("soup")) {
                subtotal += soup;
            } else {
                System.out.println("Invalid response, try again later!");
                System.exit(0);
            }
            System.out.println("Is there anything else?");
            System.out.println("Enter [Y] for Yes or [N] for No.");
            anotherItem = scan.next();
        } while (anotherItem.equalsIgnoreCase("Y"));

        //drinks
        double soda = 2.00;
        double coffee = 3.00;
        System.out.println("Would you like to add a Soda for $2 or a Coffee for $3?");
        System.out.println("Enter [S] for soda, [C] for coffee or [N] for neither.");
        String drinkRes = scan.next();
        if (drinkRes.equalsIgnoreCase("S")) {
            subtotal += soda;
        } else if (drinkRes.equalsIgnoreCase("C")) {
            subtotal += coffee;
        } else if (drinkRes.equalsIgnoreCase("N")) {
            subtotal += 0;
        } else {
            System.out.println("Invalid response, try again later.");
            System.exit(0);
        }

        //print subtotal
        System.out.println("Subtotal: " + subtotal);

        //tax
        double tax = 0.06*subtotal;
        System.out.println("Tax: " + tax);

        //total
        System.out.println("Total: " + (subtotal + tax));
    }
}
