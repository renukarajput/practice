package edu.ren.geeks.programs.matrix;

public class SpiralPattern {
    public static void main(String[] args) {
        new SpiralPattern().spiral(3);
    }
    void spiral(int n){
        for (int i = n; i >0 ; i--) {
            printRowForCurrentNum(n,i);
        }
        for (int i = 2; i <=n ; i++) {
            printRowForCurrentNum(n,i);
        }
    }

    void printRowForCurrentNum(int n,int currentNum){
        for (int i = n; i >currentNum ; i--) {
            System.out.print(i+" ");
        }
        for (int i = 0; i <2*currentNum-1 ; i++) {
            System.out.print(currentNum+" ");
        }
        for (int i = currentNum+1; i <=n ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
