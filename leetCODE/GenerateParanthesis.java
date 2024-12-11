import java.util.ArrayList;
import java.util.List;

class Solution {
    // Method to generate all combinations of well-formed parentheses
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n); // Start the recursive function with initial parameters
        return result;
    }

    // Helper function to recursively generate valid combinations
    private void generate(List<String> result, String current, int open, int close, int n) {
        // Base case: if the current string has reached the desired length (2*n)
        if (current.length() == 2 * n) {
            result.add(current); // Add the current combination to the result list
            return;
        }

        // If we can add an opening parenthesis, do it and recurse
        if (open < n) {
            generate(result, current + "(", open + 1, close, n);
        }

        // If we can add a closing parenthesis, do it and recurse
        if (close < open) {
            generate(result, current + ")", open, close + 1, n);
        }
    }
}

public class GenerateParanthesis {
    public static void main(String[] args) {
        Solution sol = new Solution(); // Create an instance of the Solution class

        // Example 1
        int n1 = 3;
        List<String> result1 = sol.generateParenthesis(n1);
        System.out.println("Generated Parentheses (n = 3): " + result1);
        // Output: ["((()))", "(()())", "(())()", "()(())", "()()()"]

        // Example 2
        int n2 = 1;
        List<String> result2 = sol.generateParenthesis(n2);
        System.out.println("Generated Parentheses (n = 1): " + result2);
        // Output: ["()"]
    }
}
