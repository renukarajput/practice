package edu.ren.geeks.array;

public class CountOfPalindromeSubtring {
    public int count(String s) {
        int i = 0, j = s.length() - 1;
        return  count(s, i, j);
    }
//aaa
    //aa aa

    public int count(String s, int start, int end) {
        if(start==end){
            return 1;
        }
        if(s.charAt(start)==s.charAt(end)){
            return count(s,start+1,end)+count(s,start,end-1)-count(s,start+1,end-1);
        }
        else {

        }
        return 0;
    }
}
