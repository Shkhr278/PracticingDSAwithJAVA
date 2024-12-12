public class StringToInt {
    public static int myAtoi(String s) {
        // Step 1: Trim leading and trailing whitespace
        s = s.trim();
        if (s.isEmpty())
            return 0;

        // Step 2: Initialize variables
        int i = 0;
        int sign = 1; // Assume positive
        int result = 0;
        int n = s.length();

        // Step 3: Handle sign
        if (s.charAt(i) == '-') {
            sign = -1; // Negative number
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        // Step 4: Convert digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check for overflow or underflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            // Update the result
            result = result * 10 + digit;
            i++;
        }

        // Step 5: Apply the sign and return
        return result * sign;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(myAtoi("42")); // Output: 42
        System.out.println(myAtoi("   -042")); // Output: -42
        System.out.println(myAtoi("1337c0d3")); // Output: 1337
        System.out.println(myAtoi("0-1")); // Output: 0
        System.out.println(myAtoi("words and 987"));// Output: 0
    }
}
