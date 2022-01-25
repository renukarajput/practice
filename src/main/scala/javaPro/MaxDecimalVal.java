package javaPro;

/**
 * Created by rrn3194 on 4/20/16.
 */
public class MaxDecimalVal {
        public static void main(String[] args) {
            int arr[][] = new int[][]{{0, 1, 0},
                                      {1, 1, 0},
                                      {1, 1, 1}};
            System.out.println("Max is:::"+findMaxDecimalValForBinary(arr));

        }

        private static int findMaxDecimalValForBinary(int[][] arr) {
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                int sum = 0;
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i][j] == 1)
                        sum += Math.pow(2 , (arr.length - 1 - j));
                }
                if(max < sum)
                    max = sum;

            }
            return max;
        }
}
