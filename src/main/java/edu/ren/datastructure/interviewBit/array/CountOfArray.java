package edu.ren.datastructure.interviewBit.array;

public class CountOfArray {

    /*
    find the count of each number in O(1) space and O(n) time
     */
    void count(int[] arr) {
        fillCounts(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int num = i + 1;
                int count = -arr[i];
                System.out.println(num + "-->" + count);
            }
        }
    }

    protected void fillCounts(int [] arr){
        countUtil(arr, 0, arr[0]);

    }
    private void countUtil(int[] arr, int position, int num) {
        while (position <= arr.length - 1) {

            int nextNum = -1;
            if (num > 0) {
                int valueAtPositionOfNumCount = arr[num - 1];
                if (valueAtPositionOfNumCount == num) {
                    if (position == num - 1) { // 1 2 2 2 5 ,in this case 5 is already at correct position and has to be counted once
                        arr[num - 1] = -1;
                    } else {
                        arr[num - 1] = -2;
                    }
                    if (position < arr.length - 1) {
                        nextNum = arr[position + 1];
                    }
                } else if (valueAtPositionOfNumCount > 0) {
                    arr[num - 1] = -1;
                    nextNum = valueAtPositionOfNumCount;
                } else {
                    arr[num - 1] = arr[num - 1] - 1;
                }
            }

            if (nextNum < 0 && position < arr.length - 1) {
                nextNum = arr[position + 1];
            }
            num = nextNum;
            position = position + 1;
            //countUtil(arr, position + 1, nextNum);
        }
    }

}
