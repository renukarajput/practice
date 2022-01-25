package edu.ren.corejava.currencyproblem;

import edu.ren.corejava.currencyproblem.Coin;
import edu.ren.corejava.currencyproblem.CurrencyVisitor;
import edu.ren.corejava.currencyproblem.Note;
import edu.ren.corejava.currencyproblem.Currency;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Currency> currencyList=new ArrayList<>();
        currencyList.add(new Coin(1));
        currencyList.add(new Note(3));
        currencyList.add(new Coin(1));
        currencyList.add(new Coin(1));
        currencyList.add(new Note(1));
        for (Currency currency:currencyList){
            currency.accept(new CurrencyVisitor());
        }
        

    }
}
