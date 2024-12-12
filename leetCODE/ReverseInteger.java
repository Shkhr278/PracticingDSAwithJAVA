class ReverseInteger {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            // Extract the last digit
            int digit = x % 10;

            // Check for overflow before updating result
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow for positive numbers
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Overflow for negative numbers
            }

            // Update the result
            result = result * 10 + digit;

            // Remove the last digit from x
            x /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        ReverseInteger solution = new ReverseInteger();

        // Test cases
        System.out.println(solution.reverse(123)); // Output: 321
        System.out.println(solution.reverse(-123)); // Output: -321
        System.out.println(solution.reverse(120)); // Output: 21
        System.out.println(solution.reverse(1534236469)); // Output: 0 (overflow)
    }
}