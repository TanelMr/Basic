package Week8;

import java.util.Scanner;

public class Shop {

    private Storehouse store;
    private Scanner reader;

    public Shop(Storehouse store, Scanner reader) {
        this.store = store;
        this.reader = reader;
    }

    public void manage(String customer) {
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Welcome to our shop " + customer);
        System.out.println("We have these items to sell:");

        for (String product : store.products()) {
            System.out.println( product );
        }

        while (true) {
            System.out.print("What would you like to buy (pass a empty value to pay):");
            String product = reader.nextLine();
            if (product.isEmpty()) {
                break;
            }
            if(this.store.products().contains(product)){
                if(this.store.take(product)){
                    basket.add(product, this.store.price(product));
                }
            }
        }

        System.out.println("Your purchases are:");
        basket.print();
        System.out.println("Total price: " + basket.price() + "  €");
    }
}