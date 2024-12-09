public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0; // Pointer at the start
        int right = height.length - 1; // Pointer at the end
        int maxArea = 0;

        while (left < right) {
            // Calculate the area between the two pointers
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = width * currentHeight;

            // Update the maximum area if the current one is larger
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer with the smaller height inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {

        int[] height1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height1)); // Output: 49

        int[] height2 = { 1, 1 };
        System.out.println(maxArea(height2)); // Output: 1
    }
}
