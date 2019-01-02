package edu.ren.corejava.currencyproblem;

import java.util.List;

public class CurrencyVisitor {
    List<Note> notes;
    List<Coin> coins;

  public void visit(Note note){
        notes.add(note);
    }

   public void visit(Coin coin){
        coins.add(coin);
    }
}
