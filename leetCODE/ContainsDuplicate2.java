import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public boolean containsDuplicate2(int[] nums, int k) {
        // Create a HashMap to store the last seen index of each element
        Map<Integer, Integer> lastSeenIndex = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            
            // If the element was seen before
            if (lastSeenIndex.containsKey(num)) {
                // Check the difference between current index and the last seen index
                int j = lastSeenIndex.get(num);
                if (i - j <= k) {
                    return true; // Condition is satisfied
                }
            }
            
            // Update the last seen index for the current element
            lastSeenIndex.put(num, i);
        }
        
        // If no such pair was found, return false
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate2 solution = new ContainsDuplicate2();
        
        // Test case 1
        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        System.out.println("Test case 1: " + solution.containsDuplicate2(nums1, k1)); // true
        
        // Test case 2
        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        System.out.println("Test case 2: " + solution.containsDuplicate2(nums2, k2)); // true
        
        // Test case 3
        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int k3 = 2;
        System.out.println("Test case 3: " + solution.containsDuplicate2(nums3, k3)); // false
    }
}
