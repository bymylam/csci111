/*
* This program simulates customer orders from a food truck.
*
* There are a series of "tests" in which a randomized number of
* customers order a randomized amount of menu items from a single
* instance of FoodTruck.
*
* The number of tests that occur are decided by the user at runtime.
*
* The test outcomes will be printed to a file called output.txt
*/

import java.util.*;
import java.io.*;

public class FoodTruckMain {
    public static void main(String[] args) throws IOException {
        //Scanner and PrintWriter tools
        Scanner scan = new Scanner(System.in);
        PrintWriter printer = new PrintWriter(new File("output.txt"));

        //User decides the number of tests that will occur
        System.out.println("Enter number of tests: ");
        int numTests = scan.nextInt();

        //Begin printing to Output file:
        printer.println("TOTAL TESTS COMPLETED: " + numTests + "\n");

        //Run tests
        for(int i = 0; i < numTests; i++) {
            printer.print("TEST NUMBER " + (i+1) + ": ");
            //Call the tester method
            //Pass the file printer as an input argument
            foodTruckTester(printer);
        }
        //Close and save the output file.
        printer.close();
    }

    /**
    * This method will "test" an instance of a FoodTruck:
    * - Given a newly constructed instance of the FoodTruck class,
    * this method will generate a randomized number of orders
    * with a randomized number of menu items per order
    */
    public static void foodTruckTester(PrintWriter printer) throws IOException{
        //Instantiating a Random object here
        //We will use this to randomly generate the number of customers
        //We will also use this to randomly generate each customer's order
        Random rand = new Random();

        //Here, we instantiate new new FoodTruck object.
        //Each FoodTruck starts out with a standard inventory,
        //which you can view in the FoodTruck class.
        FoodTruck_Completed truck = new FoodTruck_Completed();

        //Determines the maximum number of customers
        //that will place orders with this food truck
        int maxNumCustomers = 50;
        int numCustomers = rand.nextInt(maxNumCustomers) + 1;

        //Determines the boundary for random item count
        //in each order
        int randItemBound = 4;

        //Start printing infomation about this specific test
        printer.println("Customer Count = " + numCustomers);

        for(int i = 0; i < numCustomers; i++) {
            //This represents a randomized customer order
            //The customer will order a random number of coffees, sodas, bagels, etc.
            //Keep in mind that we need to call rand.nextInt each time we want
            //a new random number.
            //If we just called rand.nextInt once, it means that the count of coffees, sodas, etc
            //would all be the same.
            truck.order(rand.nextInt(randItemBound),
            rand.nextInt(randItemBound),
            rand.nextInt(randItemBound),
            rand.nextInt(randItemBound),
            rand.nextInt(randItemBound));
        }

        //Invoke the toString method for the FoodTruck object
        printer.println(truck);
        printer.println();
    }
}
