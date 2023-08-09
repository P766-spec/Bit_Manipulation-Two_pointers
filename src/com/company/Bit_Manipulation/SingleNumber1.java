package com.company.Bit_Manipulation;
// https://leetcode.com/problems/single-number/

public class SingleNumber1 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums));
    }
    static int singleNumber(int[] nums){
        int ans = 0;
        for (int i = 0; i < nums.length ; i++) {
            ans ^= nums[i];

        }
        return ans;
    }
}
