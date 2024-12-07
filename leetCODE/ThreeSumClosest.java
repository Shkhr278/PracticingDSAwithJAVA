import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        // Sort the array to use the two-pointer technique
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE / 2; // Initialize with a large value

        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1; // Pointer to the next element
            int right = nums.length - 1; // Pointer to the last element

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // Update closestSum if the current sum is closer to the target
                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                    closestSum = currentSum;
                }

                // Adjust pointers based on the sum comparison with the target
                if (currentSum < target) {
                    left++; // Move the left pointer to increase the sum
                } else if (currentSum > target) {
                    right--; // Move the right pointer to decrease the sum
                } else {
                    // If currentSum == target, it is the closest possible sum
                    return currentSum;
                }
            }
        }

        return closestSum; // Return the closest sum found
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = { -1, 2, 1, -4 };
        int target1 = 1;
        System.out.println(threeSumClosest(nums1, target1)); // Output: 2

        // Example 2
        int[] nums2 = { 0, 0, 0 };
        int target2 = 1;
        System.out.println(threeSumClosest(nums2, target2)); // Output: 0
    }
}
