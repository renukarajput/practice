package edu.ren.datastructure.interviewBit.array;

public class MedianOfSortedArraysByMerge {
    //1,12,5,26,38
    //2,13,17,30,45
    int median(int[] arrOne,int[] arrTwo){
        int totalLength = arrOne.length + arrTwo.length;
        int mid= totalLength /2;
        int indexOne=0,indexTwo=0;
        int medianOne=-1,medianTwo=-1;
        while (indexOne<arrOne.length&&indexTwo<arrTwo.length){
            if(arrOne[indexOne]<arrTwo[indexTwo]){
                if(indexOne+indexTwo==mid-1){
                    medianOne= arrOne[indexOne];
                }
                if(indexOne+indexTwo==mid){
                    medianTwo= arrOne[indexOne];
                    break;
                }
                indexOne++;
            }else {
                if(indexOne+indexTwo==mid-1){
                    medianOne= arrTwo[indexTwo];
                } if(indexOne+indexTwo==mid){
                    medianTwo= arrTwo[indexTwo];
                    break;
                }
                indexTwo++;
            }
        }
        if(medianOne==-1|| medianTwo==-1){
            while (indexOne<arrOne.length) {
                if (indexOne + indexTwo == mid - 1) {
                    medianOne = arrOne[indexOne];
                }
                if (indexOne + indexTwo == mid) {
                    medianTwo = arrOne[indexOne];
                }
                indexOne++;
            }

            while (indexTwo<arrTwo.length) {
                if (indexOne + indexTwo == mid - 1) {
                    medianOne = arrTwo[indexTwo];
                }
                if (indexOne + indexTwo == mid) {
                    medianTwo = arrTwo[indexTwo];
                }
                indexTwo++;
            }
        }

        if(totalLength%2==0){
            return (medianOne+medianTwo)/2;
        }
        return medianTwo;
    }
}
