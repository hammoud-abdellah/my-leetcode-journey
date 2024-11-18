public class main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] test1 = {1, 2, 3, 1};
        int[] test2 = {1, 2, 3, 4};
        int[] test3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] test4 = {}; // Empty array
        int[] test5 = {5}; // Single element

        // Test and print results
        System.out.println("Test 1: " + solution.containsDuplicate(test1)); // Expected: true
        System.out.println("Test 2: " + solution.containsDuplicate(test2)); // Expected: false
        System.out.println("Test 3: " + solution.containsDuplicate(test3)); // Expected: true
        System.out.println("Test 4: " + solution.containsDuplicate(test4)); // Expected: false
        System.out.println("Test 5: " + solution.containsDuplicate(test5)); // Expected: false
    }
}
