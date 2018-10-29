package edu.ren.barclays;


import java.util.ArrayList;
import java.util.List;

abstract class Currency {
    int val;

    public Currency(int val){
        this.val = val;
    }

    abstract void accept(CurrencyVisitor currencyVisitor);
}
