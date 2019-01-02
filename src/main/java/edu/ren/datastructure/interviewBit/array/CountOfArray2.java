package edu.ren.datastructure.interviewBit.array;

public class CountOfArray2 extends CountOfArray {


    @Override
    public void fillCounts(int [] arr) {

        int length=arr.length;
        int position=0;
        while (position<length){
            int num = arr[position];
            if(num>0) {
                if (num-1 == position) {
                    arr[num-1]=-1;
                    position++;
                }else {
                    int valueAtCountPositionOfNum=arr[num-1];
                    if(valueAtCountPositionOfNum>0) {
                        arr[num-1] = -1;
                        arr[position]=valueAtCountPositionOfNum;
                    }else{
                        arr[num-1]=arr[num-1]-1;
                        arr[position]=0; // mark this zero to avoid re-counting by swaps as in  2, 2,3, 3, 2, 5
                        // if not marked the 2nd last 2 will move at end and will be counted twice
                        //if number is present more than once ,count is set at one place and other is set to 0
                        position++;
                    }


                }
            }else {
                position++;
            }
        }
    }
}
