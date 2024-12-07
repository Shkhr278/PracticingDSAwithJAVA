import java.util.Stack;

public class ValidParatheses {
    public boolean isValid(String s) {
        // Stack to store the opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through the string characters
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // For closing brackets, check if they match the top of the stack
            else if (c == ')' || c == '}' || c == ']') {
                // If the stack is empty or doesn't match, it's invalid
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, c)) {
                    return false;
                }
            }
        }
        
        // If the stack is empty at the end, it's a valid string
        return stack.isEmpty();
    }

    // Helper function to check if the pair of brackets match
    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || 
               (open == '{' && close == '}') || 
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        ValidParatheses solution = new ValidParatheses();
        
        // Test cases
        String s1 = "()";
        System.out.println("Is \"" + s1 + "\" valid? " + solution.isValid(s1)); // true
        
        String s2 = "()[]{}";
        System.out.println("Is \"" + s2 + "\" valid? " + solution.isValid(s2)); // true
        
        String s3 = "(]";
        System.out.println("Is \"" + s3 + "\" valid? " + solution.isValid(s3)); // false
        
        String s4 = "([])";
        System.out.println("Is \"" + s4 + "\" valid? " + solution.isValid(s4)); // true
    }
}
