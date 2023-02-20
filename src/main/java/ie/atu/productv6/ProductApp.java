package ie.atu.productv6;

import java.util.Scanner;

public class ProductApp {

    public static void main(String args[]) {
        // display a welcome message
        int combined = 0;
        System.out.println("Welcome to the Product Viewer");
        System.out.println();

        // perform 1 or more selections
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter product code: ");
            String productCode = sc.nextLine();  // read the product code

            // get the Product object
            Productable p = ProductDB.getProduct(productCode);

            // display the output
            System.out.println();
            if (p != null) {
                System.out.println("Description: " + p.toString());
                System.out.println("Price:       " + p.getPriceFormatted());
            } else {
                System.out.println("No product matches this product code.");
            }

            System.out.println();
            combined = Product.getCount() + Animal.getCount();
            System.out.println("Product count: " + combined + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
    }
}
