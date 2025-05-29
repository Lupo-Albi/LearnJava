/*
 * Shopping cart program
 * 1. Users can type an item they want to buy
 * 2. Users can set a price for the item they chose
 * 3. Users asks for a quantity of the items they want to buy
 * The program should output:
 * 1. The total quantity of items and the item the user chose
 * 2. The total amount the user has to pay
 */

import java.util.Scanner;

public class TextShopCart {
    public static void main(String[] ignoredArgs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello and welcome to Buy Whatever You Want!");

        System.out.println("What item would you like to buy today?");
        String item = scanner.nextLine();

        System.out.println("What price would you like to pay for each item?");
        double price = scanner.nextDouble();

        System.out.println("How many would you like to buy?");
        int quantity = scanner.nextInt();

        System.out.println("\nCheckout!");
        System.out.println("You have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is $" + quantity * price);
        System.out.println("Thank you very much!");

        scanner.close();
    }
}
