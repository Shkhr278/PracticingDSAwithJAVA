import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array to use the two-pointer technique
        Arrays.sort(nums);

        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1; // Pointer to the next element
            int right = nums.length - 1; // Pointer to the last element

            // Use the two-pointer technique to find the other two elements
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Found a triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for the second and third elements
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers after finding a valid triplet
                    left++;
                    right--;
                } else if (sum < 0) {
                    // If sum is less than zero, move the left pointer to the right to increase the
                    // sum
                    left++;
                } else {
                    // If sum is greater than zero, move the right pointer to the left to decrease
                    // the sum
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result1 = threeSum(nums1);
        System.out.println(result1);

        // Example 2
        int[] nums2 = { 0, 1, 1 };
        List<List<Integer>> result2 = threeSum(nums2);
        System.out.println(result2);
    }
}
