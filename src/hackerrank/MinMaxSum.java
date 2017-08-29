package hackerrank;

/**
 * Created by rrn3194 on 11/24/16.
 */
public class MinMaxSum {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};
        getMinMaxSum(input);
    }

    private static void getMinMaxSum(int[] input) {
        int min = 0, max =  0;
        for (int i = 0; i < input.length-1; i++) {
            min = min + input[i];
            max = max + input[i+1];
            System.out.println(min+" "+max);

        }
    }
}
