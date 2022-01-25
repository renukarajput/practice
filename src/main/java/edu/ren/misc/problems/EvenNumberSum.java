package edu.ren.misc.problems;

public class EvenNumberSum {

    public static int get(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                sum += input[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {-6, -91, 1011, -100, 84, -22, 0, 1, 473};
        System.out.println(get(arr));
    }
}
