package edu.ren.barclays;


public class Note extends Currency {

    public Note(int val) {
        super(val);
    }

    public void accept(CurrencyVisitor currencyVisitor){
        currencyVisitor.visit(this);
    }
}
