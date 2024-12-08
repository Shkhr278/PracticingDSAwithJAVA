import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result; // If the array has fewer than 4 elements, return empty list
        }

        // Sort the array to facilitate the two-pointer approach
        Arrays.sort(nums);

        // Iterate through the array with two nested loops
        for (int i = 0; i < nums.length - 3; i++) {
            // Skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {
                // Skip duplicates for the second number
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                // Use two pointers to find the remaining two numbers
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicates for the third and fourth numbers
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        // Move both pointers after finding a valid quadruplet
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++; // Move the left pointer to increase the sum
                    } else {
                        right--; // Move the right pointer to decrease the sum
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = { 1, 0, -1, 0, -2, 2 };
        int target1 = 0;
        System.out.println(fourSum(nums1, target1));

        // Example 2
        int[] nums2 = { 2, 2, 2, 2, 2 };
        int target2 = 8;
        System.out.println(fourSum(nums2, target2));
    }
}
