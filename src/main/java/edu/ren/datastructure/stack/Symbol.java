package edu.ren.datastructure.stack;

class Symbol {
    Character symbol;
    boolean isOpening;
    Character pair;

    public Symbol(Character symbol, boolean isOpening, char pair) {
        this.symbol = symbol;
        this.isOpening = isOpening;
        this.pair = pair;
    }

    public Character getSymbol() {
        return symbol;
    }

    public boolean isOpening() {
        return isOpening;
    }

    public Character getPair() {
        return pair;
    }

}