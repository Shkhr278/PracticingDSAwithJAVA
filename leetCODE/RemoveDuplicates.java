public class RemoveDuplicates {
    public static void main(String[] args) {
        // Example input array (sorted in non-decreasing order)
        int[] nums = { 1, 1, 2, 2, 3, 3, 4, 5, 5 };

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Call the removeDuplicates method and store the result (number of unique
        // elements)
        int k = solution.removeDuplicates(nums);

        // Print the number of unique elements
        System.out.println("Number of unique elements: " + k);

        // Print the first k elements of the modified array
        System.out.print("Unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        // If the array is empty or has only one element, return its length
        if (nums.length == 0) {
            return 0;
        }

        // Initialize a pointer for the position of the last unique element
        int uniqueIndex = 0;

        // Loop through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is not equal to the element at uniqueIndex,
            // it's a new unique element.
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++; // Move the unique pointer
                nums[uniqueIndex] = nums[i]; // Update the element at the new unique position
            }
        }

        // The number of unique elements is uniqueIndex + 1
        return uniqueIndex + 1;
    }
}