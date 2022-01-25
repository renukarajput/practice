package edu.ren.datastructure.interviewBit.array;

public class ShiftArray {

    void shiftRightArrayBy1(int[] original) {
        int length = original.length - 1;

        int temp = original[length];
        for (int i = length - 1; i >= 0; i--)
            original[i + 1] = original[i];
        original[0] = temp;
    }

    void shiftArrayUsingTemp(int[] original, int k){
        int length = original.length;
        int temp[] = new int[k];
        int j = k;
        for (int i = 0; i < k; i++) {
            temp[i] = original[length-j];
            j--;
        }

        for (int i = length-1; i-k >= 0; i--)
            original[i] = original[i-k];

        for (int i = 0; i < k; i++)
            original[i] = temp[i];

    }

    void shiftArrayUsingArrayCopy(int[] original, int k){
        int length = original.length;
        int temp[] = new int[k];
        System.arraycopy(original, length-k, temp, 0, k);
        System.arraycopy(original, 0, original, k, length-k);
        System.arraycopy(temp, 0, original, 0, k);
    }

    void shiftRightKTimes(int[] original, int k) {
        for (int i = 0; i < k; i++) {
            shiftRightArrayBy1(original);
        }
    }

    void shiftRightKRecursive(int[] original, int k) {
        if (k == 0)
            return;

        shiftRightArrayBy1(original);
        shiftRightKRecursive(original, k - 1);
    }

    // one by one move
    void shiftRightArrayByOne(int[] original) {
        int length = original.length - 1;

        int prevTemp = original[0], currTemp = 0;

        for (int i = 1; i <= length; i++) {
            currTemp = original[i];
            original[i] = prevTemp;
            prevTemp = currTemp;
        }
        original[0] = currTemp;
    }
}
