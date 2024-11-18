public class main {
    public static void main(String[] args) {

        TwoSum solution = new TwoSum();

        // Test cases
        int[] arr = {2,7,11,15};
        int target = 9;

        // Call the twoSum method and store the result
        int[] result = solution.twoSum(arr, target);
        
        // Print results (indexes of the two numbers that add up to the target)
        System.out.println("Test 1: Indices = [" + result[0] + ", " + result[1] + "]");
    }
}
