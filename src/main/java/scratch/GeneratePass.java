package scratch;

import java.util.HashSet;
import java.util.Set;

public class GeneratePass {
    void test(double a, Double b) {
        System.out.println("double");
    }

    void test(int a, int b) {
        System.out.println("int");
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 1};
        int[] arr = {4, 1, 2, 1, 2};
//        singleNumberUsingSet(arr);
        System.out.println(singleNumber(arr));
    }

    private static int singleNumberUsingSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= arr.length - 1; i++) {
          if (!set.contains(arr[i])) {
              set.add(arr[i]);
          } else {
              set.remove(arr[i]);
          }
        }
        return set.stream().findFirst().get();
    }
    //4, 1, 2, 1, 2
    private static Integer singleNumber(int[] nums) {
       int res = nums[0];
        for (int i = 1; i <= nums.length - 1; i++) {
            res = res ^ nums[i];
        }
        return res;
    }
}

