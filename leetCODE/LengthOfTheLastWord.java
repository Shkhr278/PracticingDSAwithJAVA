public class LengthOfTheLastWord {
    public static int lengthOfLastWord(String s) {
        // Trim trailing and leading spaces from the string
        s = s.trim();

        // Find the last space in the trimmed string
        int lastSpaceIndex = s.lastIndexOf(' ');

        // Length of the last word is the difference between the end of the string
        // and the last space index
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(lengthOfLastWord("Hello World")); // Output: 5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
        System.out.println(lengthOfLastWord("luffy is still joyboy")); // Output: 6
    }
}
