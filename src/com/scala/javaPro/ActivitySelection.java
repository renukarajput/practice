package com.scala.javaPro;

class ActivitySelection {

    public static void displayMaxActivities(int startTime[], int finishTime[], int noOfActivity) {
        System.out.println("selected no of activities : ");
        int i = 0;
        System.out.println(i+" ===== ");
        for (int j = 1; j < noOfActivity; j++) {
            if (startTime[j] >= finishTime[i]) {
                System.out.println(j+" **** "+ startTime[j]);
                i = j;
            }
        }
    }

    public static void main(String[] args) {
        int startTime[] =  {10,12,4,3};
        int finishTime[] = {6,1,5,4};
        int noOfActivity = startTime.length;
        displayMaxActivities(startTime, finishTime, noOfActivity);
    }
}
