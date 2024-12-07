public class IntToRoman {
    // Method to convert an integer to a Roman numeral
    public String intToRoman(int num) {
        // Define the Roman numeral symbols and their corresponding values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder(); // To store the Roman numeral result

        // Iterate through the arrays of values and symbols
        for (int i = 0; i < values.length; i++) {
            // While the current number is greater than or equal to the current Roman numeral value
            while (num >= values[i]) {
                result.append(symbols[i]); // Append the Roman numeral symbol
                num -= values[i];          // Subtract the Roman numeral value from the number
            }
        }

        return result.toString(); // Return the Roman numeral string
    }

    // Main method for testing
    public static void main(String[] args) {
        IntToRoman sol = new IntToRoman(); // Create an instance of the IntToRoman class

        // Example 1
        int num1 = 3749;
        System.out.println(sol.intToRoman(num1)); // Output: "MMMDCCXLIX"

        // Example 2
        int num2 = 58;
        System.out.println(sol.intToRoman(num2)); // Output: "LVIII"

        // Example 3
        int num3 = 1994;
        System.out.println(sol.intToRoman(num3)); // Output: "MCMXCIV"
    }
}
