package edu.ren.datastructure.interviewBit.dynamicprogramming;

public class StairSteps {
    int getDistinctWaysToTop(int totalSteps){
        if(totalSteps==1){
            return 1;
        }
        if(totalSteps==2){
            return 2;
        }

        return getDistinctWaysToTop(totalSteps-1)+getDistinctWaysToTop(totalSteps-2);
    }
    int getIterativeDistinctWays(int totalSteps){
        if(totalSteps==1){
            return 1;
        }
        if(totalSteps==2){
            return 2;
        }
        int prevOne=1,prevTwo=2;
        int steps=0;
        for (int i = 3; i <=totalSteps ; i++) {
            steps=prevOne+prevTwo;
            prevOne=prevTwo;
            prevTwo=steps;
        }
        return steps;
    }
}
