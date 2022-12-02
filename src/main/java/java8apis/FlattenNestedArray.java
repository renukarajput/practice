package java8apis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlattenNestedArray {

    public static void main(String[] args) {
        Integer arr[][] = {{ 1, 2 }, { 3, 4, 5, 6 }, { 7, 8, 9 }};
        flattenTwoDArray(arr);
    }

    private static void flattenTwoDArray(Integer[][] arr) {
        List<Integer> list = new ArrayList<>();
        for (Integer[] array : arr) {
            Arrays.stream(array).forEach(list::add);
        }

        System.out.println(Arrays.toString(list.stream().toArray()));
    }
}
