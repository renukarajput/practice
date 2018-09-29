package edu.ren.datastructure.interviewBit.array;

public class MissingNumberInRange {
    int get(int [] arr){
        for (int i = 0; i <arr.length ;) {
            if (i+1 == arr[i]) {
                i++;
            } else {
                int indexOfNum = arr[i]-1;
                if (indexOfNum < arr.length && indexOfNum>=0) {
                    int numAtPositionOfthisElem = arr[indexOfNum];
                    arr[indexOfNum] = arr[i];
                    if(numAtPositionOfthisElem>0 && numAtPositionOfthisElem<arr.length){
                    arr[i] = numAtPositionOfthisElem;
                    }else{
                        arr[i]=0; //mark it processed
                    }

                }else {
                    //this can't be a missing no.
                    i++;
                }
            }
        }

       int lastMatchingNum=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=i+1){
                return i+1;
            }else {
                lastMatchingNum=i+1;
            }
        }
        return lastMatchingNum+1;
    }
}
