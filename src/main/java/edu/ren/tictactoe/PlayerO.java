package edu.ren.tictactoe;

public class PlayerO implements Player {
    private final String playerName = "O";

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public boolean isPlayingNow() {
        return false;
    }

    @Override
    public void play() {

    }
}
