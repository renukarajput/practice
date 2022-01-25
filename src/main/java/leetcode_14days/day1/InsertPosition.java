package leetcode_14days.day1;

public class InsertPosition {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6};
        System.out.println(searchInsert(arr, 5));
        int arr1[] = {1, 3, 5, 6};
        System.out.println(searchInsert(arr1, 2));
        int arr2[] = {1, 3, 5, 6};
        System.out.println(searchInsert(arr2, 7));
        int arr3[] = {1, 3, 5, 6};
        System.out.println(searchInsert(arr3, 0));
        int arr4[] = {1};
        System.out.println(searchInsert(arr4, 0));
        int arr5[] = {1, 3, 5, 6};
        System.out.println(searchInsert(arr5, 4));
    }

    //1,3,5,6 = 7
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int insertPos = 0;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                end = mid - 1;
                insertPos = mid;
            } else {
                start = mid + 1;
                insertPos = start;
            }
        }
        return insertPos;
    }
}
