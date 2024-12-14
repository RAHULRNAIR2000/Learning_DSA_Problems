package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int nums [] = {5,7,9,11};
       int target =11;


       int result = BinarySeacrh(nums,target);
       if(result !=-1)
        System.out.println("element found at index "+result);
       else
           System.out.println("Element nit found");
    }

    public static int linearSeacrh(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return  i;
            }

        }
        return  -1;

    }

    public static int  BinarySeacrh(int[] nums, int target) {
        int left=0;
        int right = nums.length-1 ;
       while(left<=right){
           int mid =(left+right)/2;
           if(nums[mid]==target){
               return mid;
           } else if (nums[mid]<target) {
               left=mid+1;
           }
           else
               right =mid-1;
       }
        return  -1;

    }
}