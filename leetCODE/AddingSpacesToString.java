class AddingSpacesToString {
    public static String addSpaces(String s, int[] spaces) {
        if (s.isEmpty()) { // Fixed condition for an empty string
            return "";
        }

        StringBuilder result = new StringBuilder();
        int spaceIndex = 0; // Pointer for the spaces array

        // Iterate through the characters of the string
        for (int i = 0; i < s.length(); i++) {
            // Check if the current index matches the space array's value
            if (spaceIndex < spaces.length && i == spaces[spaceIndex]) {
                result.append(' '); // Append a space
                spaceIndex++; // Move to the next space index
            }
            result.append(s.charAt(i)); // Append the character from the string
        }

        return result.toString(); // Return the resulting string
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(addSpaces("LeetcodeHelpsMeLearn", new int[] { 8, 13, 15 })); // Output: "Leetcode Helps Me Learn"
        System.out.println(addSpaces("icodeinpython", new int[] { 1, 5, 7, 9 })); // Output: "i code in py thon"
        System.out.println(addSpaces("spacing", new int[] { 0, 1, 2, 3, 4, 5, 6 })); // Output: " s p a c i n g"
    }
}