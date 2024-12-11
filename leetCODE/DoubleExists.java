import java.util.HashSet;

public class DoubleExists {
    public static boolean checkIfExist(int[] arr) {
        // Create a HashSet to store visited numbers
        HashSet<Integer> seen = new HashSet<>();

        // Iterate through the array
        for (int num : arr) {
            // Check if the double of the current number or half of it exists in the set
            if (seen.contains(2 * num) || (num % 2 == 0 && seen.contains(num / 2))) {
                return true;
            }
            // Add the current number to the set
            seen.add(num);
        }

        // No such pair found
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = { 10, 2, 5, 3 };
        System.out.println(checkIfExist(arr1)); // Output: true

        int[] arr2 = { 3, 1, 7, 11 };
        System.out.println(checkIfExist(arr2)); // Output: false
    }
}
