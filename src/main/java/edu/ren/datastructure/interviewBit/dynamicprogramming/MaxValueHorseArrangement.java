package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class MaxValueHorseArrangement {
    final char WHITE = 'W';
    final char BLACK = 'B';

    int get(String horses, int partition) {
        return get(horses, 0, partition);
    }

    //AB 2-1
    private int get(String horses, int index, int partition) {
        int[][] result = new int[horses.length() + 1][partition + 1];
        result[0][0] = 0;
        int numWhite = 0, numBlack = 0;
        for (int i = 1; i <= partition; i++) {
            result[0][i] = -1;
        }
        for (int i = index; i <= horses.length(); i++) {
            if (horses.charAt(i) == WHITE) {
                numWhite++;
            } else {
                numBlack++;
            }
            result[i][1] = numWhite * numBlack;
        }

        if (horses.length() - index < partition) {
            return -1;
        }
        int minResult = Integer.MAX_VALUE;
        for (int i = 1; i <=partition ; i++) {
            numBlack=0;
            numWhite=0;
            for (int j = 1; j <horses.length() ; j++) {
                if(horses.charAt(j-1)==WHITE){
                    numWhite++;
                }else {
                    numBlack++;
                }
                result[j][i]=result[j-1][i-1]+numBlack*numWhite;
            }
        }

        return 0;
    }
}
