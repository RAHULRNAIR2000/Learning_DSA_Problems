package org.example;

import java.util.*;

public class LargestElementInArray {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(3,2,13,24,15,20);
        ArrayList<Integer> nums = new ArrayList<>();
        Collections.addAll(nums,3,12,43,1,34,78,46);
        System.out.println(numbers);
        System.out.println(nums);
        Optional<Integer> maxArraylist =nums.stream().max(Comparator.naturalOrder());
        Optional<Integer> maxlist =numbers.stream().max(Comparator.naturalOrder());
        System.out.println(maxArraylist.get());
        System.out.println(maxlist.get());
    }
}
