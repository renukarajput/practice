package edu.ren.corejava.currencyproblem;

public abstract class Currency {
   protected int val;
    public Currency(int value) {
        this.val=value;
    }
    protected abstract void accept(CurrencyVisitor currencyVisitor);
}
