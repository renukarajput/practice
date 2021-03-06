package edu.ren.design.patterns.strategy.strategy;

import edu.ren.design.patterns.strategy.PaymentStrategy;

public class PayPalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public PayPalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using paypal");
    }
}
