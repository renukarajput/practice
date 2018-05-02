package edu.ren.algo.bsearch;

public class Palindrome {

public int numberOfCharsRequired(String input){
    char[] arr=input.toCharArray();
    int len=arr.length;
    return getNumberOfCharsToInsert(arr,0,len-1);
}

private int getNumberOfCharsToInsert(char[] str, int start,int end){
   int count=0,matchedCount=0;
   while (end>start) {
       if (str[start] == str[end]) {
           start++;
           matchedCount++;
           end--;
       } else {
           //qzhnbnfuvqnq   qlrzjpxi
           if(matchedCount>0&&str[end]!=str[end+1]) {
               start=start-matchedCount;
               count=count+matchedCount+1;
           }else {
               count++;
           }
           end--;
           matchedCount=0;
       }
   }

    return count;

}
}
