package edu.ren.geeks.string;

/**
 * Created by rrn3194 on 9/5/17.
 */
public class PronicNumber {

    public void getPronicNumberUptoN(int range) {
        int num = 0;
        if (range < 0)
            throw new NumberFormatException();

        for (int i = 0; i < range; i++) {
                num = i * (i + 1);
            if(num <= range)
                System.out.print(num+" => ");
        }
    }
}
