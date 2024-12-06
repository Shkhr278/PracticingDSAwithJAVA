public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        // If lengths are not equal, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // Create frequency arrays for both strings
        int[] count = new int[26]; // There are 26 lowercase letters

        // Count the frequency of each character in both strings
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // Increment count for s
            count[t.charAt(i) - 'a']--; // Decrement count for t
        }

        // Check if all counts are zero
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        IsAnagram solution = new IsAnagram();
        
        // Test case 1
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(solution.isAnagram(s1, t1)); // true

        // Test case 2
        String s2 = "rat";
        String t2 = "car";
        System.out.println(solution.isAnagram(s2, t2)); // false
    }
}
