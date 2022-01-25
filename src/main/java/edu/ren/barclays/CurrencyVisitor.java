package edu.ren.barclays;


import java.util.ArrayList;
import java.util.List;

public class CurrencyVisitor {
    public List<Note> getNoteList() {
        return noteList;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    List<Note> noteList=new ArrayList<>();
    List<Coin> coinList=new ArrayList<>();

    public void visit(Note note){
        noteList.add(note);
    }

    public void visit(Coin coin){
        coinList.add(coin);
    }

    public void visit(Object others){
        //ignore
        // noteList.add(note);
    }
}
