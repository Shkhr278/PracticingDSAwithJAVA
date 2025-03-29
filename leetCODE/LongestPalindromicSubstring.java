class LongestPalindromicSubstring {
    // Expand around a center and return palindrome length
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1)
            return "";

        int start = 0, end = 0;

        // Try to expand palindrome around each center
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // Odd length palindrome
            int len2 = expandAroundCenter(s, i, i + 1); // Even length palindrome
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();

        // Test cases
        System.out.println(solution.longestPalindrome("babad")); // Output: "bab" or "aba"
        System.out.println(solution.longestPalindrome("cbbd")); // Output: "bb"
        System.out.println(solution.longestPalindrome("a")); // Output: "a"
        System.out.println(solution.longestPalindrome("ac")); // Output: "a" or "c"
    }
}
