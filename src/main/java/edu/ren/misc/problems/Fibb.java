package edu.ren.misc.problems;

public class Fibb {

    public static void main(String[] args) {
        int no = 10;
//        for(int i=0; i<= no; i++){
//            System.out.print(fibbSeries(i)+" ");
//        }
       // System.out.println(fibb(no));
    }

    public static int fibb(int no) {
        if (no <= 1)
            return no;
        return fibb(no-1)+fibb(no-2);
    }

    public static int getNthFibbNumber(int no){
        int max = 20;
        int[] lookup = new int[max];
        if (lookup[no] == 0) {
            if (no <= 1)
                lookup[no] = no;
            else
                lookup[no] = getNthFibbNumber(no-1) + getNthFibbNumber(no-2);
            /*for (int i = 0; i < lookup.length; i++) {
                System.out.println("** "+lookup[i]);
            }*/
        }
        return lookup[no];
    }

}
