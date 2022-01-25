package edu.ren.datastructure.interviewBit.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GrayCode2 extends GrayCode{
    ArrayList<Integer> ans;
    @Override
    ArrayList<Integer> get(int n) {
        if(n==0){
            ans = new ArrayList<Integer>();
            ans.add(0);
            return ans;
        }
        ans = get(n-1);
        int numToAdd = 1<<(n-1);
        for(int i=ans.size()-1; i>=0; i--){
            ans.add(numToAdd+ans.get(i));
        }
        return ans;
    }

}
