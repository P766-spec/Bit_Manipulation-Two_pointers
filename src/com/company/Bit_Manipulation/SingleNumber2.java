package com.company.Bit_Manipulation;
// https://leetcode.com/problems/single-number-ii/

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] nums ={0,1,0,1,0,1,99};
        System.out.println(singleNumber2(nums));
    }
    static int singleNumber2(int[] nums){
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            int bitmask = 1 << i;
            for(int n : nums)
                if((n & bitmask) != 0)
                    sum++;
            if (sum % 3 == 1) {
                ans |= bitmask;
            }

        }
        return ans;
    }
}
