import java.util.HashMap;
import java.util.Map;

public class LC1_TwoSum {

    /*
        1. Two Sum
        https://leetcode.com/problems/two-sum/

        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        Example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]

        Example 3:
        Input: nums = [3,3], target = 6
        Output: [0,1]

        Constraints:
        2 <= nums.length <= 104
        -109 <= nums[i] <= 109
        -109 <= target <= 109
        Only one valid answer exists.
     */

    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2 || nums.length > 10*10*10*10+1) {
            return new int[]{};
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
//        throw new IllegalArgumentException("no match found");
    }

    public int[] twoSum_HashMap(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (hm.containsKey(diff)){
                return new int[]{hm.get(diff), i};
            } else {
                hm.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }


    public int[] twoSumWrong(int[] nums, int target) {
        int[] aray = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    aray[0] = i;
                    aray[1] = j;
//                    return new int[]{i, j};
                }
            }
        }
        return aray;
//        throw new IllegalArgumentException("no match found");
    }
}
