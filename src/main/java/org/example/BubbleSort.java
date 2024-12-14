package org.example;

public class BubbleSort {
    public static void main(String[] args) {
        int nums []={6,7,9,2,12,26,5};
        int size=nums.length;
        int temp;
        System.out.println("Before sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();


        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }

            }

        }

        System.out.println("after sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
