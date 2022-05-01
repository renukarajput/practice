package edu.ren.design.patterns.strategy.strategy;

/**
 * Created by rrn3194 on 7/7/17.
 */
public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);
        Item item3 = new Item("5555",10);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.removeItem(item3);

        //pay by paypal
        cart.pay(new PayPalStrategy("myemail@example.com", "mypwd"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Renuka Rajput", "1234567890123456", "786", "12/15"));


    }


}
