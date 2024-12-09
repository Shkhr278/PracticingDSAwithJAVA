import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the array from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // If current digit is less than 9, increment and return
                digits[i]++;
                return digits;
            }
            // If current digit is 9, set it to 0 (carry over)
            digits[i] = 0;
        }

        // If loop completes, we had a carry extending beyond the most significant digit
        int[] result = new int[n + 1];
        result[0] = 1; // Set the first digit to 1 (new carry)
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(Arrays.toString(plusOne(new int[] { 1, 2, 3 }))); // Output: [1, 2, 4]
        System.out.println(Arrays.toString(plusOne(new int[] { 4, 3, 2, 1 }))); // Output: [4, 3, 2, 2]
        System.out.println(Arrays.toString(plusOne(new int[] { 9 }))); // Output: [1, 0]
        System.out.println(Arrays.toString(plusOne(new int[] { 9, 9, 9 }))); // Output: [1, 0, 0, 0]
    }
}
