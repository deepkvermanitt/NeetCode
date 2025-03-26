package arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums, return true if any value appears more than once in
 * the array, otherwise return false.
 * Example 1:
 * <p>
 * Input: nums = [1, 2, 3, 3]
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1, 2, 3, 4]
 * <p>
 * Output: false
 */


public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> numMap = new HashMap<Integer, Boolean>();
        for (int number : nums) {
            if (numMap.containsKey(number)) {
                return true;
            } else {
                numMap.put(number, true);
            }
        }
        return false;
    }
}
