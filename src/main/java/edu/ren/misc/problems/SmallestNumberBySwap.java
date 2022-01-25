package edu.ren.misc.problems;

public class SmallestNumberBySwap {
    String nextSmallest(String num){
        final char[] arr = num.toCharArray();
        nextSmallest(arr);
        return new String(arr);
    }

    void nextSmallest(char[] num){
        int first=-1,second=-1;
        for (int i = 0; i <num.length ; i++) {
            for (int j = i; j <num.length ; j++) {
                if(Character.getNumericValue(num[j])<Character.getNumericValue(num[i])&&(second==-1||Character.getNumericValue(num[j])<= Character.getNumericValue(num[second]))){
                    first=i;second=j;
                }
            }
            if(first!=-1){
                break;
            }
        }
        swap(num,first,second);

    }

    void swap(char[] arr ,int i,int j){
        if(i<0||j<0||i>=arr.length||j>=arr.length){
            return;
        }
        char temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
