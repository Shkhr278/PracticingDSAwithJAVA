class SearchInSortedRotatedArray {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If target found at mid
            if (nums[mid] == target) {
                return mid;
            }

            // Check which part is sorted
            if (nums[left] <= nums[mid]) { // Left half is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Search left
                } else {
                    left = mid + 1; // Search right
                }
            } else { // Right half is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Search right
                } else {
                    right = mid - 1; // Search left
                }
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        SearchInSortedRotatedArray solution = new SearchInSortedRotatedArray();

        int[] nums1 = { 4, 5, 6, 7, 0, 1, 2 };
        int target1 = 0;
        System.out.println(solution.search(nums1, target1));

        int[] nums2 = { 4, 5, 6, 7, 0, 1, 2 };
        int target2 = 3;
        System.out.println(solution.search(nums2, target2));

        int[] nums3 = { 1 };
        int target3 = 0;
        System.out.println(solution.search(nums3, target3));

    }
}