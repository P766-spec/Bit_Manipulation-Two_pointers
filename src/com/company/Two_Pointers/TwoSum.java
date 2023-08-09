package com.company.Two_Pointers;
// https://www.geeksforgeeks.org/check-if-pair-with-given-sum-exists-in-array/

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {0, -1, 2, -3, 1 };
        int target = 3;
        int[] result = twoSum(nums,target);
        System.out.println("Two sum indices are : " + result[0] + " and " + result[1]);

    }
    static int[] twoSum(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int[] ans = new int[2];

        while(start < end){
            int sum = nums[start] + nums[end];
            if(sum == target){
                ans[0] = start + 1; // used 1- based indexing
                ans[1] = end + 1; // used 1 -based indexing
                break;
            } else if ( sum < target){
                start++;
            } else {
                end--;
            }
        }
        return ans;
    }
}
