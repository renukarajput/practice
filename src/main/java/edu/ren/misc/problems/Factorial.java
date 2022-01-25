package edu.ren.misc.problems;

public class Factorial {

    public static int tailRecursionFactorial(int n, int result) {
        if (n == 1)
            return result;

        return tailRecursionFactorial(n - 1, n * result);
    }
}
