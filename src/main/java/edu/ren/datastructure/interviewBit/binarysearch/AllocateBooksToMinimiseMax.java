package edu.ren.datastructure.interviewBit.binarysearch;

import java.util.List;

 class AllocateBooksToMinimiseMax {
     boolean isFeasible(List<Integer> arr, int k,int maxAllocation){
         int currentSum=0,numberOfStudents=1;
         for (int i = 0; i <arr.size() ; i++) {
             Integer currentNum = arr.get(i);
             if(currentNum >maxAllocation){
                 return false;
             }
             if(currentSum+ currentNum <=maxAllocation){
                 currentSum+= currentNum;
             }else {
                 numberOfStudents++;
                 if(numberOfStudents>k){
                     return false;
                 }
                 currentSum= currentNum;
             }
         }
         return true;
     }

    int maxAllocation(List<Integer> arr, int k) {
        if(k>arr.size()){
            return -1;
        }

        int sum = arr.stream().mapToInt(x -> x.intValue()).sum();
        int minMaxAllocation=Integer.MAX_VALUE;
        int start=0,end=sum;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(isFeasible(arr,k,mid)){
                minMaxAllocation=Math.min(mid,minMaxAllocation);
                end=mid-1; //successful ,try with lower books to each
            }else {
                start=mid+1; //need to give more books to each to make a feasible distribution
            }
        }
    return minMaxAllocation;
    }
 }