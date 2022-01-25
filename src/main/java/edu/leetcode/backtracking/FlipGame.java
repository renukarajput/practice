package edu.leetcode.backtracking;

public class FlipGame {
    public boolean canWin(String s) {
        return canWin(s.toCharArray(), true);
        //return canWin_(s.toCharArray());
    }

    public boolean canWin(char[] string, boolean isPlayerOne) {
        boolean canMove = false;
        for (int i = 0; i < string.length - 1; i++) {
            if (string[i] == '+' && string[i + 1] == '+') {
                string[i] = '-';
                string[i + 1] = '-';
                canMove = true;
                boolean canWin = canWin(string, !isPlayerOne);
                string[i] = '+';
                string[i + 1] = '+';
                if (!canWin && !isPlayerOne)
                    return true;

            }
        }
        return canMove == false && !isPlayerOne;
    }


    public boolean canWin_(char[] string) {
        for (int i = 0; i < string.length - 1; i++) {
            if (string[i] == '+' && string[i + 1] == '+') {
                string[i] = '-';
                string[i + 1] = '-';
                boolean canWin = !canWin_(string);
                string[i] = '+';
                string[i + 1] = '+';
                if (canWin)
                    return true;

            }
        }
        return false;
    }
}
