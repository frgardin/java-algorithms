package leetcode;

import java.util.HashMap;

public class leetcode169 {

    public int majorityElement(int[] nums) {
        int t = nums.length / 2;
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
            if (m.get(nums[i]) > t) {
                return nums[i];
            }
        }
        return nums[0];
    }
}
