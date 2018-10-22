package Shopping2;

import java.util.*;

public class ShoppingTest2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = 0;

        ShoppingCart2 cart = new ShoppingCart2();

        System.out.println("Would you like to go shopping? YES or NO");
        String shop = scan.nextLine();

        if(shop.equalsIgnoreCase("yes")) {
            while (x == 0) {
                System.out.println("what would you like to buy?");
                String name = scan.nextLine();
                System.out.println("How much dose it cost?");
                double price = scan.nextDouble();
                System.out.println("How much are you going to buy?");
                int amount = scan.nextInt();
                scan.nextLine();

                cart.addToCart(name, price, amount);

                System.out.println("Would you like to continue shopping? YES or NO");
                String shopMore = scan.nextLine();

                if(shopMore.equalsIgnoreCase("no")){
                    System.out.println("Okay goodbye.");
                    x++;
                }
            }
            System.out.println(cart.toString());

            System.out.println("Please pay " + cart.getTotalPrice());
        }
        else if (shop.equalsIgnoreCase("no")) {
            System.out.println("Okay goodbye.");
        }
    }
}
