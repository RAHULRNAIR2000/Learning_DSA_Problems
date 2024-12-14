package org.example;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int nums [] = {5,7,9,11};
        int target =11;


        int result = BinarySeacrh(nums,target,0,nums.length-1);
        if(result !=-1)
            System.out.println("element found at index "+result);
        else
            System.out.println("Element nit found");
    }

    public static int  BinarySeacrh(int[] nums, int target,int left,int right) {



        if(left<=right){
            int mid =(left+right)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
               return BinarySeacrh(nums,target,mid+1,right);
            }
            else
                return BinarySeacrh(nums,target,left,mid-1);
         }

        return  -1;

    }

}
