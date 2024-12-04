public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Keeps track of the count of non-val elements
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the element is not equal to val, move it to the front
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k; // Return the count of non-val elements
    }

    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();
        int[] nums = {3, 2, 2, 3}; // Example input
        int val = 3;
        
        int k = solution.removeElement(nums, val); // Call the method
        
        // Output the result
        System.out.println("Number of elements not equal to " + val + ": " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
