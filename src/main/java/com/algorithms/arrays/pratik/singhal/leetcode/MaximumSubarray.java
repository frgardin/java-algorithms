package com.algorithms.arrays.pratik.singhal.leetcode;


/*
Given an integer array nums, find the
subarray
with the largest sum, and return its sum.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.



Constraints:

    1 <= nums.length <= 105
    -104 <= nums[i] <= 104



Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

Solution: Kadane’s algorithm

PSEUDOCODE

    Initialize:
        max_so_far = INT_MIN
        max_ending_here = 0

    Loop for each element of the array

      (a) max_ending_here = max_ending_here + a[i]
      (b) if(max_so_far < max_ending_here)
                max_so_far = max_ending_here
      (c) if(max_ending_here < 0)
                max_ending_here = 0
    return max_so_far

 */

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = 0;
        int i = 0;
        while (i < nums.length) {
            maxEndingHere += nums[i];
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
            i++;
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] n1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] n2 = {1};
        int[] n3 = {5, 4, -1, 7, 8};
        int[] n4 = {2, 3, 4, 5, 1};

        System.out.println(maxSubArray(n4));
        System.out.println(maxSubArray(n1));
        System.out.println(maxSubArray(n2));
        System.out.println(maxSubArray(n3));
    }
}
