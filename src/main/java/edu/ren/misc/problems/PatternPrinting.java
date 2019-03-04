package edu.ren.misc.problems;

public class PatternPrinting {

    public void printPyramid(int rows){
        int cnt = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= cnt; j++) {
                System.out.print(j);
            }
            cnt++;
            System.out.println();
        }
    }

    public void printPyramidFromLeft(int rows){
        int cnt = 1;
        for (int i = 0; i < rows; i++) {
            for (int k = rows - cnt; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= cnt; j++) {
                System.out.print(j);
            }
            cnt++;
            System.out.println();
        }
    }
    public void printTriangle(int rows){
        int cnt = 1;
        for (int i = 0; i < rows; i++) {
            for (int k = rows - i; k > 1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= cnt; j++) {
                System.out.print(j);
            }
            for (int m = cnt-1; m > 0 ; m--) {
                System.out.print(m);
            }
            cnt++;
            System.out.println();
        }
    }
}
