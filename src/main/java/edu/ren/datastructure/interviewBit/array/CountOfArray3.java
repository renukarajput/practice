package edu.ren.datastructure.interviewBit.array;

public class CountOfArray3 extends CountOfArray {

    @Override
    void count(int[] arr) {
        fillCounts(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                int num = i + 1;
                int count = arr[i];
                System.out.println(num + "-->" + count);
            }
        }
    }

    @Override
    public void fillCounts(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i] -= 1;
        }

        for (int i = 0; i < length; i++) {
            arr[arr[i] % length] += length;
        }

        for (int i = 0; i < length; i++) {
            arr[i] = arr[i] / length;
        }
    }
}
