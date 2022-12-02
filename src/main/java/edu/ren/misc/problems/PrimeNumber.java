package edu.ren.misc.problems;

public class PrimeNumber {

    public void generate(int num) {
        for (int i = 2; i < num; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(i + ", ");
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


    public void generatePrimeNumForRange(int num) {
        for(int i = 2; i < num; i++) {
            if (isPrimeNo(i)) {
                System.out.print(i + ", ");
            }
        }
    }
    public boolean isPrimeNo(int no) {
//        if (no <= 1) {
//            return false;
//        } else if (no == 2 /*|| no == 3 || no == 5 || no == 7*/) {
//            return true;
//        } else if(no % 2 == 0 /*|| no % 3 == 0 || no % 5 == 0 || no % 7 == 0*/) {
//          return false;
//       }
        for (int i = 2; i <= Math.sqrt(no); i++) {
            if (no % i == 0)
                return false;
        }
        return true;
    }
}
