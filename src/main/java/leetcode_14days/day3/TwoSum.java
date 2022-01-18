package leetcode_14days.day3;


import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        twoSumOptimized(new int[]{2, 7, 11, 15}, 9);
        twoSumOptimized(new int[]{2, 3, 4}, 6);
        twoSumOptimized(new int[]{-1, 0}, -1);
        twoSumOptimized(new int[]{0, 0, 3, 4}, 0);
    }

    //    O(n^2)
    public static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        for (int i = 0; i <= arr.length - 1; i++) {
//            int diff = arr[i] > target ? arr[i] - target : target - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                }
            }
        }
        return null;
    }

    //O(n)
    public static int[] twoSumOptimized(int[] arr, int sum) {
        int[] result = new int[2];
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == sum) {
                result[0] = left + 1;
                result[1] = right + 1;
                System.out.println(Arrays.toString(result));
                return result;
            } else if (arr[left] + arr[right] < sum) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }

    //    O(nlogn)
    public static int[] twoSumUsingBinarySearch(int[] arr, int target) {
        int[] result = new int[2];   // 2, 7, 11, 15 = 9
        for (int i = 0; i <= arr.length - 1; i++) {
            int diff = arr[i] > target ? arr[i] - target : target - arr[i];
            result[0]=  i;
            result[1] = getIdxUsingBinarySearch(arr, diff);

        }
        return result;
    }

    private static int getIdxUsingBinarySearch(int[] arr, int diff) {

        return -1;
    }

}
