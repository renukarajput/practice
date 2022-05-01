package edu.ren.barclays;


public class
Bag<T extends Currency> {

    CurrencyVisitor currencyVisitor;

    public Bag(CurrencyVisitor currencyVisitor) {
        this.currencyVisitor = currencyVisitor;
    }

    public void add(T type) {
        currencyVisitor.visit(type);
    }

    public void display() {
        StringBuilder coinOutput = new StringBuilder();

        coinOutput.append("Coins: ");
        for (Currency c : currencyVisitor.coinList) {
             coinOutput.append(c.val+" ,");
        }

        StringBuilder noteOutput = new StringBuilder();
        noteOutput.append("Notes: ");
        for (Currency c : currencyVisitor.noteList) {
            noteOutput.append(c.val+" ,");
        }
        noteOutput.deleteCharAt(noteOutput.length()-1);
        coinOutput.deleteCharAt(coinOutput.length()-1);
        System.out.println(coinOutput.toString());
        System.out.println(noteOutput.toString());
    }

}
