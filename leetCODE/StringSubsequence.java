class StringSubsequence {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        int j = 0; // Pointer for str2

        for (int i = 0; i < n && j < m; i++) {
            char current = str1.charAt(i);
            char next = (char) ((current - 'a' + 1) % 26 + 'a'); // Cyclic increment

            // Check if str2[j] matches current or next incremented character
            if (str2.charAt(j) == current || str2.charAt(j) == next) {
                j++; // Move to the next character in str2
            }
        }

        // If we matched all characters of str2, return true
        return j == m;
    }

    public static void main(String[] args) {
        StringSubsequence solution = new StringSubsequence();

        // Test cases
        System.out.println(solution.canMakeSubsequence("abc", "ad")); // Output: true
        System.out.println(solution.canMakeSubsequence("zc", "ad")); // Output: true
        System.out.println(solution.canMakeSubsequence("ab", "d")); // Output: false
    }
}
