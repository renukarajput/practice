package gs;

import java.util.Arrays;

public class MissingAndRepeatingNumber {
    int result[] = {-1, -1};

    //2 1 3 3 5
    public int[] find(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                System.out.println("Repeating elm : " + arr[i] + " Missing elm :" + (i + 1));
                result[0] = i + 1;
                result[1] = arr[i];
                return result;
            }
        }
        return result;
    }

    public int[] findOptimized(int[] arr) {
        int[] frequency = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i] - 1;
            frequency[index] = frequency[index] + 1;
        }
        //2 1 3 3 5
        System.out.println(Arrays.toString(frequency));
        for (int i = 0; i < arr.length; i++) {
            if (frequency[i] == 0) {
                result[0] = i + 1;
            }
            if (frequency[i] == 2) {
                result[1] = i + 1;
            }
        }
        return result;
    }

    /**
     * 2 1 3 3 5
     * -2 -1 -3 3 5
     * -2 -1 0 3 -5
     * //-2 -1 3 3 -5    twice=2
     *
     * @param arr
     * @return
     */
    public int[] findInPlace(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0)
                arr[index] = 0;
            else arr[index] *= -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("twice" + (i + 1));
            } else if (arr[i] > 0) {
                System.out.println("missing" + (i + 1));
            }
        }
        return result;
    }
}
