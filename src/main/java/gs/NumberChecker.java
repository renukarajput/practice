package gs;


import java.util.*;

public class NumberChecker {
    public static void main(String[] args) {
        int[] input1 = {123, 43218, 1456, 345671};
        int[] input = {11243, 20143, 2314567, 123, 1234, 123, 987, 999, 131};
        System.out.println(findQualifiedNumbers(input));
        System.out.println(isNumberQualified(123));
        System.out.println(isNumberQualified(1456));
        System.out.println(isNumberQualified(345671));
        System.out.println(isNumberQualified(43218));
    }

    public static String findQualifiedNumbers(int[] numberArray) {
        List<Integer> list = new ArrayList<>();
        for (int no : numberArray) {
            if (isNumberQualified(no)) {
                list.add(no);
            }
        }
        if (list.isEmpty()) return "-1";
        Collections.sort(list);
        StringJoiner sb = new StringJoiner(",");
        list.stream().forEach(x -> sb.add(x.toString()));
        return sb.toString();
    }

    private static boolean isNumberQualified(int num) {
        boolean[] res = new boolean[3];
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            if (rem == 1 || rem == 2 || rem == 3) {
                res[rem - 1] = true;
            }
        }
        return res[0] && res[1] && res[2];
    }
}
