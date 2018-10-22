package Shopping;

import Shopping.ShoppingCart;

import java.util.*;

public class ShoppingTest {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int x =0;

        ShoppingCart cart = new ShoppingCart();

        System.out.println("Would you like to go shopping? YES or NO");
        String shop = scan.nextLine();

        if(shop.equalsIgnoreCase("yes")) {
            while (x < 5) {
                System.out.println("what would you like to buy?");
                String name = scan.nextLine();
                System.out.println("How much dose it cost?");
                double price = scan.nextDouble();
                System.out.println("How much are you going to buy?");
                int amount = scan.nextInt();
                scan.nextLine();
                System.out.println("Would you like to continue shopping? YES or NO");
                String shopMore = scan.nextLine();

                if(shopMore.equalsIgnoreCase("no")){
                    System.out.println("Okay goodbye.");
                    x = 10;
                }

                cart.addToCart(name, price, amount);

                x++;
            }
            if(!(x < 5)) {
                System.out.println("\nSorry the cart is too full.");
            }
            System.out.println(cart.toString());

            System.out.println("Please pay " + cart.getTotalPrice());
        }
        else if (shop.equalsIgnoreCase("no")) {
            System.out.println("Okay goodbye.");
        }
    }
}
