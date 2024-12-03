public class MajorityElement {
    public int majorityElement(int[] nums) {
        // Initialize variables to store the number and the count
        int number = nums[0];
        int count = 0;

        // Iterate through the array to find the majority element number
        for (int num : nums) {
            // If the count is 0, choose a new number
            if (count == 0) {
                number = num;
            }
            // If the current number matches the number, increase count
            if (num == number) {
                count++;
            } else {
                // Otherwise, decrease the count
                count--;
            }
        }

        // The number at the end will be the majority element
        return number;
    }

    public static void main(String[] args) {
        MajorityElement solution = new MajorityElement();
        
        // Test case 1
        int[] nums1 = {3, 2, 3};
        System.out.println("Majority element in nums1: " + solution.majorityElement(nums1)); // Output: 3
        
        // Test case 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority element in nums2: " + solution.majorityElement(nums2)); // Output: 2
    }
}
