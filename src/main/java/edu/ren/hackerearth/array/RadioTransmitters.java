package edu.ren.hackerearth.array;

import java.util.Arrays;

public class RadioTransmitters {
    // 1 2 3 4 5 6 ..... // 1, 3, 5, 4, 9, 7, 11, 15
    public int get(int[] arr, int freq) {
        int length = arr.length;
        int diff = 0;
        int place = 0;
        Arrays.sort(arr);
        int numOfTransmitters = 0;
        if (freq == 1) {
            numOfTransmitters = length / 2;
        } else {
            for (int i = 0; i < length-freq; ) {
                diff = arr[i + freq] - arr[i];
                if (diff <= freq && arr[i] <= place) {
                    place = arr[i] + freq;
                }
                numOfTransmitters++;
                i++;
            }
        }
        return numOfTransmitters;
    }

    public int noOfRequiredTransmitters(int[] arr, int freq) {
        int length = arr.length;
        Arrays.sort(arr);
        int numOfTransmitters = 0;

        //1, 3, 4, 5, 7, 9, 11, 15
        for (int i = 0; i < length; ) {
            numOfTransmitters++;

            int place = arr[i] + freq;

            while (i < length && arr[i] <= place) i++;
            --i;
            place = arr[i] + freq;

            while (i < length && arr[i] <= place) i++;
        }
        System.out.println(numOfTransmitters);
        return numOfTransmitters;
    }
}

