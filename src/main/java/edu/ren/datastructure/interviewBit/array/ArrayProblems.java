package edu.ren.datastructure.interviewBit.array;

public class ArrayProblems {
    // {0,9,9} // {1,2,3} // {9,9} // {0,1,2}
    public void addOneToUnitDigitInArray(int[] input) {
        int index = input.length - 1;
        int carry = 1;
//        boolean carryForwardFlag = false;
        while (index >= 0) {
            if (input[index] < 9) {
                input[index] = input[index] + 1;
                break;
            }


            if (input[index] == 9) {
                input[index] = 0;
            } else {
                input[index] = carry;
            }
            index--;
        }

    }

    public int findDuplicateInArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j]) {
                    return input[i];
                }
            }
        }
        return -1;
    }

}
