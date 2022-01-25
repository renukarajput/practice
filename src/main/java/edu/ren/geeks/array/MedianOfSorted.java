package edu.ren.geeks.array;

public class MedianOfSorted {

    public static int median(int[] one,int[] two,int startOfOne,int endOfOne,int startOfTwo,int endOfTwo){
        if(one[one.length/2]>two[two.length/2]){
            return median(one,two,0,one.length/2,two.length/2,endOfTwo);
        }else {
            //return median(one,two,)
        }return 0;

    }
}
