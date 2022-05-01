package edu.ren.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PramatiCode {
    static List<MyNumber> list = new ArrayList<>();
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(new MyNumber(random.nextInt()));
        }
        System.out.println(list);
        MyNumber highestNum = getHighestNum(list);
        System.out.println("=== "+highestNum.val);
    }

    private static MyNumber getHighestNum(List<MyNumber> list) {
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}

class MyNumber implements Comparable<MyNumber>{
    Integer val;

    public MyNumber(Integer val) {
        this.val = val;
    }

    @Override
    public int compareTo(MyNumber myNumber) {

        return this.val.compareTo(myNumber.val) > 1 ? 1 : 0;
   /*     if (this.val.compareTo(myNumber.val) > 1){
            return 1;
        } else if(this.val.compareTo(myNumber.val) < 1){
            return -1;
        } else {
            return 0;
        }*/
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                "val=" + val +
                '}';
    }
}
