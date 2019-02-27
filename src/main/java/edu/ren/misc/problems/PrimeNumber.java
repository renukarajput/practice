package edu.ren.misc.problems;

public class PrimeNumber {

    public void generate(int num) {
        for (int i = 1; i < num; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(i);
        }
    }

    public void get(int num) {
        for (int i = 1; i < num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    void printPrime(int number){
        if (number == 1) return;
        printPrime(number-1);
        if(isPrimeRec(number)){
            System.out.println(number);
        }
    }

    public boolean isPrimeRec(int num){
        return isPrimeRec(num,2);
    }

    public boolean isPrimeRec(int num, int divisor) {
        if (divisor == num)
            return true;

        return num % divisor != 0 && isPrimeRec(num, divisor + 1);
    }
}
