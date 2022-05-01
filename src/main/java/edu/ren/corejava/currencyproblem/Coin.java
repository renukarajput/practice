package edu.ren.corejava.currencyproblem;

public class Coin extends Currency{

    public Coin(int value) {
       super(value);
    }

    @Override
   public void accept(CurrencyVisitor currencyVisitor){
        currencyVisitor.visit(this);
    }
}
