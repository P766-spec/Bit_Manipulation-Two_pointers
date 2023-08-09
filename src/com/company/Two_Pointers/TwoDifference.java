package com.company.Two_Pointers;
// https://www.geeksforgeeks.org/find-a-pair-with-the-given-difference/

public class TwoDifference {
    public static void main(String[] args) {
        int[]  arr = {1, 8, 30, 40, 100};
        int n = -60;
        findPair(arr,n);

    }
    static boolean findPair(int[] arr, int n){
        int size = arr.length;
        int i =0, j = 1;

        while(i < size && j < size){
            if(i != j && (arr[j] - arr[i] == n || arr[i] - arr[j] == n)) {
                System.out.println("Pair Found: " + "(" + arr[i] +", " + arr[j]+ " )");
                return true;
            }

            else if(arr[j] - arr[i] < n)
                j++;
            else
                    i++;
        }
        System.out.println("No such pair");
        return false;
    }
}
