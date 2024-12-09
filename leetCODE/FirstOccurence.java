public class FirstOccurence {
    public static int strStr(String haystack, String needle) {
        // Edge case: Empty needle
        if (needle.isEmpty())
            return 0;

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        // Loop through haystack to find the needle
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            // Check if the substring matches the needle
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }

        // Needle not found
        return -1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(strStr("sadbutsad", "sad")); // Output: 0
        System.out.println(strStr("leetcode", "leeto")); // Output: -1
    }
}
