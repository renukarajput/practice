package edu.ren.datastructure.interviewBit.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllInterLeavingsOfTwoString {

    List<String> generate(String one, String two) {
        ArrayList<String> result = new ArrayList<>();
        generate(one, 0, two, 0, new char[one.length()+two.length()], result);
        return result;

    }

    void generate(String one, int i, String two, int j, char[] temp,List<String> result) {
     if(i+j==temp.length){
         System.out.println(Arrays.toString(temp));
         result.add(new String(temp));
         return;
     }
     if(i<one.length()){
         temp[i+j]=one.charAt(i);
         generate(one,i+1,two,j,temp,result);
     }
     if(j<two.length()){
         temp[i+j]=two.charAt(j);
         generate(one,i,two,j+1,temp,result);
     }

    }

}
