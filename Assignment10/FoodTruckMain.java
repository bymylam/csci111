import java.text.NumberFormat;
/*
 * This class implements a Food Truck with the following menu:
 * - Coffee
 * - Soda
 * - Bagel
 * - Sandwich
 * - Chips
 */
public class FoodTruck {
    /*
     * Class Constants:
     * These are static, final values - meaning they will remain
     * unchanged for any instance of the FoodTruck class
     */

    // Beginning inventory of menu items
    private static final int COFFEE_STARTING_INVENTORY = 200;
    private static final int SODA_STARTING_INVENTORY = 75;
    private static final int BAGEL_STARTING_INVENTORY = 40;
    private static final int SANDWICH_STARTING_INVENTORY = 75;
    private static final int CHIPS_STARTING_INVENTORY = 75;

    // Menu item prices
    public static final double COFFEE_PRICE = 2;
    public static final double SODA_PRICE = 1.5;
    public static final double BAGEL_PRICE = 3;
    public static final double SANDWICH_PRICE = 8;
    public static final double CHIPS_PRICE = 2;

    // Tax rate
    public static final double TAXRATE = 0.06;

    // Currency formatter
    private static final NumberFormat FORMATTER = NumberFormat.getCurrencyInstance();

    /*
     * Class Fields:
     * These are non-static instance variables
     * These fields are initialized with a value
     * in the constructor. The field values may change
     * throughout the life of the instance.
     */

    // Remaining inventory
    private int coffeesRemaining;
    private int sodasRemaining;
    private int bagelsRemaining;
    private int sandwichesRemaining;
    private int chipsRemaining;

    // Order counters
    private int fulfilledOrders;
    private int unfulfilledOrders;

    // Gross Revenue
    private double revenue;

    /*
     * Constructor
     */
    public FoodTruck() {
        coffeesRemaining = COFFEE_STARTING_INVENTORY;
        sodasRemaining = SODA_STARTING_INVENTORY;
        bagelsRemaining = BAGEL_STARTING_INVENTORY;
        sandwichesRemaining = SANDWICH_STARTING_INVENTORY;
        chipsRemaining = CHIPS_STARTING_INVENTORY;
        unfulfilledOrders = 0;
        fulfilledOrders = 0;
    }

    /*
     * Instance methods:
     * These methods ARE tied to an instance of a class. This means
     * these methods operate by accessing the state of a specific
     * instance of FoodTruck.
     */
    public String toString() {
        return "Filled Orders = " + fulfilledOrders + ", Unfulfilled Orders = " + unfulfilledOrders +
                ", Revenue = " + FORMATTER.format(revenue);
    }

    //TO DO: Implement this method
    public void order(int numCoffees, int numSodas, int numBagels,
                      int numSandwiches, int numChips) {
        // This method will:
        // - Checks the current inventory to see if all items are available
        // - IF the entire order is available:
        if (numCoffees <= coffeesRemaining &&
            numSodas <= sodasRemaining &&
            numBagels <= bagelsRemaining &&
            numSandwiches <= sandwichesRemaining &&
            numChips <= chipsRemaining) {

            // - deduct the ordered items from remaining inventory
            coffeesRemaining -= numCoffees;
            sodasRemaining -= numSodas;
            bagelsRemaining -= numBagels;
            sandwichesRemaining -= numSandwiches;
            chipsRemaining -= numChips;

            // - increment the fulfilledOrders field
            fulfilledOrders++;

            // - add the cost of the order to the revenue field (cost is the menu item price * the menu item count)
            double orderCost = (numCoffees*COFFEE_PRICE) +
                    (numSodas*SODA_PRICE) +
                    (numBagels*SODA_PRICE) +
                    (numSandwiches*SANDWICH_PRICE) +
                    (numChips*CHIPS_PRICE);
            revenue += orderCost;

        // - IF there is not sufficient inventory to fulfill order:
        } else {
            // - increment the unfulfilledOrders field
            unfulfilledOrders++;
            // - leave remaining inventory and revenue unchanged
        }
    }

    /*
     * Static Methods:
     * These are methods that are not tied to a specific instance.
     * These are public methods, therefore they can be used internally
     * and externally in client code.
     */
    // This method will return a formatted String representing a receipt.
    public static String formatReceipt(double subtotal) {
        double tax = subtotal * TAXRATE;
        double total = subtotal + tax;
        int space = 12;
        return String.format("%-" + space + "s", "Subtotal:") +
                FORMATTER.format(subtotal) + "\n" +
                String.format("%-" + space + "s", "Tax:") + FORMATTER.format(tax) +
                "\n" +
                String.format("%-" + space + "s", "Total:") +
                FORMATTER.format(total) + "\n";
    }

    //This method will return a mes sage stating the order cannot be fulfilled.
    public static String declineOrderMessage() {
        return "Unfortunately, we cannot fulfill your order. " + "\nHave a nice day!";
    }

    //This method will return the menu
    public static String menu() {
        int space = 12;
        return String.format("%-" + space + "s", "Coffee:") +
                FORMATTER.format(COFFEE_PRICE) + "\n" +
                String.format("%-" + space + "s", "Soda:") +
                FORMATTER.format(SODA_PRICE) + "\n" +
                String.format("%-" + space + "s", "Bagel:") +
                FORMATTER.format(BAGEL_PRICE) + "\n" +
                String.format("%-" + space + "s", "Sandwich:") +
                FORMATTER.format(SANDWICH_PRICE) + "\n" +
                String.format("%-" + space + "s", "Chips:") +
                FORMATTER.format(CHIPS_PRICE) + "\n";
    }
}
