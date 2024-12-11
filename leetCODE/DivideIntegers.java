class DivideIntegers {
    public int divide(int dividend, int divisor) {
        // Handle overflow for edge case: dividend = Integer.MIN_VALUE, divisor = -1
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine if the result should be negative
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Convert dividend and divisor to long to handle abs(Integer.MIN_VALUE)
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        // Initialize the quotient
        int quotient = 0;

        // Subtract divisor multiples using bitwise left shifts
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor;
            int multiple = 1;

            // Find the largest multiple of divisor that fits into the dividend
            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }

            // Subtract and add to quotient
            absDividend -= tempDivisor;
            quotient += multiple;
        }

        // Apply the sign to the quotient
        return isNegative ? -quotient : quotient;
    }

    public static void main(String[] args) {
        DivideIntegers solution = new DivideIntegers();

        // Test cases
        System.out.println(solution.divide(10, 3)); // Output: 3
        System.out.println(solution.divide(7, -3)); // Output: -2
        System.out.println(solution.divide(0, 1)); // Output: 0
        System.out.println(solution.divide(1, 1)); // Output: 1
        System.out.println(solution.divide(-2147483648, -1)); // Output: 2147483647 (overflow case)
    }
}
