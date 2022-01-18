package edu.leetcode.dp;

import java.text.DecimalFormat;

public class MinimumRoundingErrorDP extends MinimumRoundingError {
    DecimalFormat df = new DecimalFormat("#.##");
    @Override
    public String minimizeError(String[] prices, int target) {
        double[][] errors=new double[prices.length][3];
        double[][] sums=new double[prices.length][3];
        for (int i = 0; i <prices.length ; i++) {
            errors[i][0]=0;
            sums[i][0]+=round(prices[i]);
           // Math.ceil(prices[i])
            errors[i][1]=Math.min(errors[i-1][0],Math.min(errors[i-1][1],errors[i-1][2]));
            //sums[i][0]+=round();
        }
return "";
    }

    private static double round (String value) {
        int precision=3;
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(Double.valueOf(value) * scale) / scale;
    }
}
