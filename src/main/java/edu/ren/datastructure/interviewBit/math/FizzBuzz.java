package edu.ren.datastructure.interviewBit.math;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rrn3194 on 11/21/18.
 */
public class FizzBuzz {

    public ArrayList<String> fizzBuzzSeries(int num) {
        ArrayList<String> list = new ArrayList();
        int i = 1;
        while (i <= num) {
            if (i % 3 == 0 && i % 5 == 0)
                list.add("FizzBuzz");
            else if (i % 3 == 0)
                list.add("Fizz");
            else if (i % 5 == 0)
                list.add("Buzz");
            else
                list.add(String.valueOf(i));

            i++;
        }
        return list;
    }

    public void printText(int number) {
        int i = 1;
        while (i <= number) {
            if (i % 3 == 0 && i % 7 == 0)
                System.out.println("HappyDays");
            else if (i % 3 == 0)
                System.out.println("Happy");
            else if (i % 7 == 0)
                System.out.println("Days");
            else
                System.out.println(i);
            i++;
        }
    }

}
