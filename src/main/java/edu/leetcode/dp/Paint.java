package edu.leetcode.dp;

class Paint extends PaintHouses{
    public int minCost(int[][] costs) {
        int[][]result=new int[costs.length][costs[0].length];

        for(int i=0;i<costs[0].length;i++){
            result[0][i]=costs[0][i];
        }
        int rCost=Integer.MAX_VALUE;

        for(int i=1;i<costs.length;i++){
            int rowCost=Integer.MAX_VALUE;
            for(int j=0;j<costs[0].length;j++){
                int minCostForK=Integer.MAX_VALUE;
                for(int k=0;k<costs[0].length;k++){
                    if(k==j)
                        continue;
                    int cost=result[i-1][k]+costs[i][j];
                    minCostForK=Math.min(cost,minCostForK);
                }
                result[i][j]=minCostForK;

                rowCost=Math.min(rowCost,minCostForK);
            }
            if(i==costs.length-1)
                rCost=Math.min(rowCost,rCost);
        }
        return  rCost;
    }
}