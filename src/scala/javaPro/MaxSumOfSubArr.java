package scala.javaPro;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rrn3194 on 6/26/16.
 */
public class MaxSumOfSubArr {

        public static int findContiguous(int len, int arr1[]){
            int sum ;
            int resSum = 0;
            List<Integer> sumList = new ArrayList<>();
            for(int i = 0; i < len; i++) {
                sum = 0;
                if(arr1[i] > 0)
                    sumList.add(arr1[i]);
                else
                    sumList = new ArrayList<>();
                for(int sum1 : sumList)
                    sum += sum1;
                if(resSum == 0 || resSum < sum)
                    resSum = sum;
               // System.out.println(sumList+"==="+sum);
            }
            return resSum;
        }

        public static void main(String[] args) {
            int[] arr = {7, 12, -2, 3, 6, -1, 5 , 9 , 0 , 10 , 8};
            System.out.println("Result is:::"+ findContiguous(arr.length, arr));
        }
}
