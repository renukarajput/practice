package edu.ren.tictactoe;

public class PlayerX implements Player {
    static final String playerName = "X";

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public boolean isPlayingNow() {
        return true;
    }

    @Override
    public void play() {

    }
}
