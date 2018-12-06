package edu.ren.datastructure.interviewBit.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GrayCode {

    List<Integer> get(int n) {
        List<String> sequence = new ArrayList<>();

            sequence.add("0");
            sequence.add("1");

       List<String> result = new ArrayList<>();
        generate(sequence, result,n-1);
        //result.forEach(s-> System.out.println(s));
        List<Integer> collected = result.stream().map(s -> intValueOfBinary(s)).collect(Collectors.toList());
       // System.out.println(collected);
        return collected;
    }

    private int intValueOfBinary(String s) {
        int sum=0;
        for (int i = 0; i <s.length() ; i++) {
           int value= (int) (Math.pow(2,i)*Character.getNumericValue(s.charAt(s.length()-1-i)));
           sum+=value;
        }
        return sum;
    }

    void generate(List<String> initial, List<String> result,int n) {
        if(0==n){
            initial.forEach(s -> result.add(s));
            return;
        }
        List<String> temp=initial.stream().map(s->"0".concat(s)).collect(Collectors.toList());
        Collections.reverse(initial);
        for (int i = 0; i < initial.size(); i++) {
            initial.set(i,"1".concat(initial.get(i)));
        }
        temp.addAll(initial);
        generate(temp, result,n-1);
    }
}
