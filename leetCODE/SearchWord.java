public class SearchWord {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Iterate over the words to find the prefix match
        for (int i = 0; i < words.length; i++) {
            // Check if the word starts with the searchWord
            if (words[i].startsWith(searchWord)) {
                return i + 1; // Return 1-based index
            }
        }

        // No match found
        return -1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPrefixOfWord("i love eating burger", "burg")); // Output: 4
        System.out.println(isPrefixOfWord("this problem is an easy problem", "pro")); // Output: 2
        System.out.println(isPrefixOfWord("i am tired", "you")); // Output: -1
    }
}
