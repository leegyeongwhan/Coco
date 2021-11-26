package AlgorithmSolving.LeetCode;

import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {  //number 1,2, 3  targer 8
//        int[] answer = new int[2];
//        int lengh = nums.length;
//        for (int i = 0; i < lengh; i++) {
//            for (int j = i + 1; j < lengh; j++) {
//                if (target == nums[i] + nums[j]) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
        Map<Integer, Integer> num = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            num.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (num.containsKey(complement) && num.get(complement) != i) {
                return new int[]{i, num.get(complement)};
            }
        }
        return null;
    }

}
