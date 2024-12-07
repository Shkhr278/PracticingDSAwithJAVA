public class Validpalindrome {
    public boolean isPalindrome(String s) {
        // Initialize two pointers
        int left = 0;
        int right = s.length() - 1;

        // Loop until the two pointers meet
        while (left < right) {
            // Move left pointer to the next alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move right pointer to the previous alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare the characters (ignoring case)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; // Not a palindrome
            }

            // Move the pointers closer to the center
            left++;
            right--;
        }

        // If the loop completes without mismatches, it's a palindrome
        return true;
    }

    public static void main(String[] args) {
        Validpalindrome solution = new Validpalindrome();

        // Test case 1
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Is \"" + s1 + "\" a palindrome? " + solution.isPalindrome(s1)); // true

        // Test case 2
        String s2 = "race a car";
        System.out.println("Is \"" + s2 + "\" a palindrome? " + solution.isPalindrome(s2)); // false

        // Test case 3
        String s3 = " ";
        System.out.println("Is \"" + s3 + "\" a palindrome? " + solution.isPalindrome(s3)); // true
    }
}
