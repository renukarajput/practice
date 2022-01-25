package edu.ren.barclays;


public class Coin extends Currency {

    public Coin(int val) {
        super(val);
    }

    public void accept(CurrencyVisitor currencyVisitor){
        currencyVisitor.visit(this);
    }
}
