class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // Binary Search to find the correct position
        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoids integer overflow

            if (nums[mid] == target) {
                return mid; // Target found, return index
            } else if (nums[mid] < target) {
                left = mid + 1; // Move right
            } else {
                right = mid - 1; // Move left
            }
        }

        // If target is not found, `left` is the correct insertion index
        return left;
    }

    public static void main(String[] args) {
        SearchInsertPosition solution = new SearchInsertPosition();

        // Test cases
        System.out.println(solution.searchInsert(new int[] { 1, 3, 5, 6 }, 5)); // Output: 2
        System.out.println(solution.searchInsert(new int[] { 1, 3, 5, 6 }, 2)); // Output: 1
        System.out.println(solution.searchInsert(new int[] { 1, 3, 5, 6 }, 7)); // Output: 4
        System.out.println(solution.searchInsert(new int[] { 1, 3, 5, 6 }, 0)); // Output: 0
        System.out.println(solution.searchInsert(new int[] { 1 }, 2)); // Output: 1
    }
}