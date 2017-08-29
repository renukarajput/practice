package design.patterns.strategy.strategy;

import design.patterns.strategy.PaymentStrategy;

/**
 * Created by rrn3194 on 7/7/17.
 */
public class CreditCardStrategy  implements PaymentStrategy {
    private String name;
    private String cvv;
    private String dateOfExpiry;
    private String cardNumber;

    public CreditCardStrategy(String name, String cvv, String dateOfExpiry, String cardNumber) {
        this.name = name;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid with credit/debit card");
    }
}
