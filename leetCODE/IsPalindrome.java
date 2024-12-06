public class IsPalindrome {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Reverse the integer
        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Check if the original number is equal to the reversed number
        return original == reversed;
    }

    public static void main(String[] args) {
        IsPalindrome solution = new IsPalindrome();
        
        // Test case 1
        int x1 = 121;
        System.out.println("Is " + x1 + " a palindrome? " + solution.isPalindrome(x1)); // true
        
        // Test case 2
        int x2 = -121;
        System.out.println("Is " + x2 + " a palindrome? " + solution.isPalindrome(x2)); // false
        
        // Test case 3
        int x3 = 10;
        System.out.println("Is " + x3 + " a palindrome? " + solution.isPalindrome(x3)); // false
    }
}
