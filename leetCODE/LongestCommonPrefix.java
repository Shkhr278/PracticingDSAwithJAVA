public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Return an empty string if the array is null or empty
        }

        // Take the first string as the initial prefix
        String prefix = strs[0];

        // Compare the prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix length until it matches
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, return ""
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix; // Return the final common prefix
    }

    public static void main(String[] args) {

        String[] strs1 = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs1)); // Output: "fl"

        String[] strs2 = { "dog", "racecar", "car" };
        System.out.println(longestCommonPrefix(strs2)); // Output: ""
    }
}
