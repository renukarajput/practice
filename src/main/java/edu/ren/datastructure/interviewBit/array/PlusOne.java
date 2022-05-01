package edu.ren.datastructure.interviewBit.array;

import java.util.List;

public class PlusOne {

    // using an arraylist
    public List<Integer> plusOne(List<Integer> input) {
        int index = input.size() - 1;
        boolean isCarryPending = true;

        while (index >= 0) {
            if (input.get(index) == 9) {
                input.set(index,0);
            } else {
                input.set(index, input.get(index)+1);
                isCarryPending = false;
                break;
            }
            index--;
        }

        if (isCarryPending && index < 0) {
            input.add(0, 1);
            return input;
        }

        int startIndex = 0;
        while (startIndex < input.size() && input.get(0) == 0) {
            startIndex++;
            input.remove(0);
        }

        if (isCarryPending && startIndex > 0) {
            input.add(0, 1);
            return input;
        }
        return input;
    }


    // using an array
    public int[] addOneToUnitDigitInArray(int[] input) {
        int index = input.length - 1;
        boolean isCarryPending = true;

        while (index >= 0) {
            if (input[index] == 9) {
                input[index] = 0;
            } else {
                input[index] = input[index] + 1;
                isCarryPending = false;
                break;
            }
            index--;
        }
        int[] result = input;

        if (isCarryPending && index < 0) {
            result = new int[input.length + 1];
            result[0] = 1;
            System.arraycopy(input, 0, result, 1, input.length);
            return result;
        }
        int startIndex = 0;
        while (startIndex < input.length && input[startIndex] == 0) {
            startIndex++;
        }
        if (!isCarryPending) {
            result = new int[input.length - startIndex];
            System.arraycopy(input, startIndex, result, 0, input.length - startIndex);
        }

        if (isCarryPending && startIndex > 0) {
            input[--startIndex] = 1;
            result = new int[input.length - startIndex];
            System.arraycopy(input, startIndex, result, 0, result.length);
            return result;
        }

        return result;
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
