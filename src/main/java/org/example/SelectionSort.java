package org.example;

public class SelectionSort {
    public static void main(String[] args) {
        int nums []={6,7,9,2,12,26,5};
        int size=nums.length;
        int temp=0;
        int minIndex=-1;
        System.out.println("Before sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("sorting starts");

    for(int i=0;i<size-1;i++){
    minIndex=i;
    for (int j=i+1;j<size;j++){
        if(nums[minIndex]>nums[j]){
            minIndex=j;
        }

    }
        temp=nums[minIndex];
        nums[minIndex]=nums[i];
        nums[i]=temp;

        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();
}




        System.out.println("after sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
    }

