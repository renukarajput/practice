package edu.ren.misc.problems;

public class PowerUtil {

    int powerOfN(int n) { //n=2
        if (n == 0) return 1;
        if (n == 1) return 2;
        int result = 1;
        while (n > 0) {
            result *= 2;
            n--;
        }
        return result;
    }

    int powerOfNOptimized(int x, int n) {
        if (n == 0) return 1;
        int temp = powerOfNOptimized(x, n / 2);

        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }
}
