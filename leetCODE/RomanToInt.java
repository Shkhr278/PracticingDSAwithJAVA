import java.util.HashMap;

public class RomanToInt {
    // Method to convert a Roman numeral to an integer
    public int romanToInt(String s) {
        // Define the Roman numeral symbols and their corresponding values
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int total = 0;  // To store the resultant integer
        int n = s.length();  // Length of the Roman numeral string

        // Loop through each character of the Roman numeral string
        for (int i = 0; i < n; i++) {
            // Check if the current character is smaller in value than the next character
            if (i < n - 1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                total -= roman.get(s.charAt(i));  // Subtract the current value from the total
            } else {
                total += roman.get(s.charAt(i));  // Add the current value to the total
            }
        }

        return total;  // Return the final integer value
    }

    // Main method for testing
    public static void main(String[] args) {
        RomanToInt sol = new RomanToInt(); // Create an instance of the RomanToInt class

        // Example 1
        String s1 = "III";
        System.out.println(sol.romanToInt(s1)); // Output: 3

        // Example 2
        String s2 = "LVIII";
        System.out.println(sol.romanToInt(s2)); // Output: 58

        // Example 3
        String s3 = "MCMXCIV";
        System.out.println(sol.romanToInt(s3)); // Output: 1994
    }
}
