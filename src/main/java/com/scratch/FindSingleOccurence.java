package com.scratch;

public class FindSingleOccurence {
    int getSingleNumber(int[] arr){
      int start=0,end=arr.length;

      while (start<end){
          int mid=start+(end-start)/2;

          if(mid>0 && arr[mid]==arr[mid-1]){
              if(mid%2==0){
                  end=mid-1;
              }else {
                  start=mid+1;
              }
          }else if(mid<arr.length-1 && arr[mid]==arr[mid+1]){
              if(mid%2!=0){
                  end=mid-1;
              }else {
                  start=mid+1;
              }
          }else {
              return arr[mid];
          }
      }
      return -1; //no such no
    }
}
