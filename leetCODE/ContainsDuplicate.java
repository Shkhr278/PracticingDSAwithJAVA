import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // Use a set to store the unique elements
        Set<Integer> duplicate = new HashSet<>();

        // Iterate through the array
        for (int num : nums) {
            // If the element is already in the set, return true (duplicate found)
            if (duplicate.contains(num)) {
                return true;
            }
            // Add the element to the set
            duplicate.add(num);
        }

        // No duplicates found
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();

        // Test case 1
        int[] nums1 = { 1, 2, 3, 1 };
        System.out.println("Does nums1 contain duplicates? " + solution.containsDuplicate(nums1)); // true

        // Test case 2
        int[] nums2 = { 1, 2, 3, 4 };
        System.out.println("Does nums2 contain duplicates? " + solution.containsDuplicate(nums2)); // false

        // Test case 3
        int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println("Does nums3 contain duplicates? " + solution.containsDuplicate(nums3)); // true
    }
}
