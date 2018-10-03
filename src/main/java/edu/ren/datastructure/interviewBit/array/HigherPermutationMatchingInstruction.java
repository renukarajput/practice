package edu.ren.datastructure.interviewBit.array;

import java.util.ArrayList;

public class HigherPermutationMatchingInstruction extends NextHigherPermutation {
    ArrayList<Integer> permutation(int num, char[] instruction) {
        ArrayList<Integer> numArr = new ArrayList<>(num+1);

        for (int i = 0; i < num; i++) {
            numArr.add(i + 1);
        }
        permutation(numArr, instruction);
        return numArr;
    }

    private void permutation(ArrayList<Integer> arr, char[] instruction) {
        int arrayIndex = 1, instructionIndex = 0;
        int countOfDSeq = 0;
        while (arrayIndex < arr.size()) {
            if (instruction[instructionIndex] == 'D') {
                countOfDSeq++;
                if(arrayIndex==arr.size()-1){
                    reverseSubArrayofD(arr, arrayIndex, countOfDSeq);
                }
            }
            else if (countOfDSeq > 0) {
                reverseSubArrayofD(arr, arrayIndex-1, countOfDSeq);
                countOfDSeq=0;
            }
            arrayIndex++;
            instructionIndex++;
        }

    }

    protected void reverseSubArrayofD(ArrayList<Integer> arr, int arrayIndex, int countOfDSeq) {
        int endIndex = arrayIndex ;
        int startIndex = arrayIndex - countOfDSeq;
        reverse(arr, startIndex, endIndex);
    }


}
