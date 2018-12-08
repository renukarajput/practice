package edu.ren.corejava.currencyproblem;

public class Note extends Currency {
    public Note(int value) {
        super(value);
    }

    @Override
    public void accept(CurrencyVisitor currencyVisitor){
        currencyVisitor.visit(this);
    }
}
