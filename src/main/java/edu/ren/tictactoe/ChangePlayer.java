package edu.ren.tictactoe;

public class ChangePlayer {
    String turn = PlayerX.playerName;

    public void nextPlayer() {
        if (turn == PlayerO.playerName) {
            turn = PlayerX.playerName;
        } else {
            turn = PlayerO.playerName;
        }
    }

    public String getTurn() {
        return turn;
    }
}
