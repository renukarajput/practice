package edu.ren.datastructure.interviewBit.binarysearch;

public class PowerFunction {
    int powerMod(int base, int power, int divisor) {
        int result = (int)power(base, Math.abs(power), divisor);
        if (power < 0 && result!=0) {
            return 1 / result;
        }
        if(result<0){
            result+=divisor;
        }
        return result % divisor;
    }

    /**9^2%5 =((9%5)*(9%5))%5
     * 81%5=
     * ((5*1+4)*(5*1+4))%5
     * =(5*5+5*4+4*5+4*4)%5
     * =(5*(5+4+4) +4*4)%5
     * =4*4%5
     * =1
     * so num^2%div =((num%d)*(num%d))%d
     * @param base
     * @param power
     * @param divisor
     * @return
     */
    private long power(int base, int power, int divisor) {
        if (power == 0) {
            return 1;
        }

        if (power % 2 != 0) {
            return (base * power(base, power - 1, divisor))%divisor;
        }
        long resultOfHalf = power(base, power / 2, divisor);
        long square = (resultOfHalf%divisor) *(resultOfHalf%divisor);
        return square%divisor;

    }
}
