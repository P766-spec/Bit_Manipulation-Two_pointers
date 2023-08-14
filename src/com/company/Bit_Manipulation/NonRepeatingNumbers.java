package com.company.Bit_Manipulation;
//  https://practice.geeksforgeeks.org/problems/finding-the-numbers0215/1

import java.util.*;
public class NonRepeatingNumbers {
    public static void main(String[] args) {
        int[] nums ={1, 2, 3, 2, 1, 4};

        int[] result = singleNumber(nums);
        System.out.println(result[0] + " " + result[1]);

    }
    static int[] singleNumber(int[] nums){
        int xor = 0;
        for(int x : nums) xor ^= x;
        int a = 0, b = 0;
        int rightMostBit = xor& - xor;
        for(int x : nums){
            if((rightMostBit & x) != 0){
                a ^= x;
            } else {
                b ^= x;
            }
        }
        int res[] = new int[2];
        if(a < b){
            res[0] = a;
            res[1] = b;
        } else {
            res[0] = b;
            res[1] = a;
        }
        return res;
    }
}
