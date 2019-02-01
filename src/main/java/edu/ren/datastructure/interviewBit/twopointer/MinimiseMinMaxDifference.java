package edu.ren.datastructure.interviewBit.twopointer;

import java.util.ArrayList;
import java.util.Arrays;

//8 100 150
//7  70 90
//6 99 160
@SuppressWarnings("Duplicates")
public class MinimiseMinMaxDifference {

    int minDifference(Integer[] first, Integer[] second, Integer[] third) {
        return minDifference(arrayListOf(first), arrayListOf(second), arrayListOf(third));
    }

    int minDifference_(ArrayList<Integer> first, ArrayList<Integer> second, ArrayList<Integer> third) {
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < first.size(); i++) {
            for (int j = 0; j < second.size(); j++) {
                for (int k = 0; k < third.size(); k++) {
                    int max = Math.max(first.get(i), Math.max(second.get(j), third.get(k)));
                    int min = Math.min(first.get(i), Math.min(second.get(j), third.get(k)));
                    int currentResult = Math.abs(max - min);
                   /* if(currentResult==0){
                        System.out.println(min+" "+max);
                    }*/
                    result = Math.min(result, currentResult);
                }
            }
        }
        return result;
    }

    int minDifference(ArrayList<Integer> first, ArrayList<Integer> second, ArrayList<Integer> third) {
        int firstIndex, secondIndex, thirdIndex;
        firstIndex = secondIndex = thirdIndex = 0;
        int max = Math.max(first.get(firstIndex), Math.max(second.get(secondIndex), third.get(thirdIndex)));
        int min = Math.min(first.get(firstIndex), Math.min(second.get(secondIndex), third.get(thirdIndex)));
        int currentResult = Math.abs(max - min);
        int result = currentResult;
        while (firstIndex < first.size() - 1 || secondIndex < second.size() - 1 || thirdIndex < third.size() - 1) {
            boolean moved = false;
            while (firstIndex < first.size() - 1 && max != first.get(firstIndex) && (Math.abs(first.get(firstIndex + 1) - max) < Math.abs(first.get(firstIndex) - max) || first.get(firstIndex).equals(first.get(firstIndex + 1)))) {
                moved = true;
                firstIndex++;
            }
            while (secondIndex < second.size() - 1 && max != second.get(secondIndex) && ((Math.abs(second.get(secondIndex + 1) - max) < Math.abs(second.get(secondIndex) - max) || second.get(secondIndex).equals(second.get(secondIndex + 1))))) {
                moved = true;
                secondIndex++;
            }
            while (thirdIndex < third.size() - 1 && max != third.get(thirdIndex) && (Math.abs(third.get(thirdIndex + 1) - max) < Math.abs(third.get(thirdIndex) - max) || third.get(thirdIndex).equals(third.get(thirdIndex + 1)))) {
                moved = true;
                thirdIndex++;
            }
            if (!moved) {
                boolean isRemaining = false;
                if (max == first.get(firstIndex) && firstIndex != first.size() - 1) {
                    isRemaining = true;
                    firstIndex++;
                }
                if (max == second.get(secondIndex) && secondIndex != second.size() - 1) {
                    isRemaining = true;
                    secondIndex++;
                }
                if (max == third.get(thirdIndex) && thirdIndex != third.size() - 1) {
                    isRemaining = true;
                    thirdIndex++;
                }

                if (!isRemaining) {
                    if (!isRemaining && firstIndex < first.size() - 1) { //first has 8 12 and max is 10
                        firstIndex++;
                        isRemaining = true;
                    }
                    if (!isRemaining && secondIndex < second.size() - 1) {
                        secondIndex++;
                        isRemaining = true;
                    }
                    if (!isRemaining && thirdIndex < third.size() - 1) {
                        thirdIndex++;
                    }
                }
            }
            max = Math.max(first.get(firstIndex), Math.max(second.get(secondIndex), third.get(thirdIndex)));
            min = Math.min(first.get(firstIndex), Math.min(second.get(secondIndex), third.get(thirdIndex)));
            currentResult = Math.abs(max - min);
            result = Math.min(result, currentResult);
        }
        return result;
    }

    private ArrayList<Integer> arrayListOf(Integer[] first) {
        return new ArrayList<>(Arrays.asList(first));
    }
}
