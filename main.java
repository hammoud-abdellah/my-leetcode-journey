public class main {
    public static void main(String[] args) {

        TopKFrequentElements solution = new TopKFrequentElements();

        // Test cases
        int[] nums = {1,1,1,1,2,2,3};
        int k = 2;

        
        int[] result = solution.topKFrequent(nums, k);
        // solution.topKFrequent(nums, k);
        
        // Print results (indexes of the two numbers that add up to the target)
        // System.out.println("Test 1: Indices = [" + result[0] + ", " + result[1] + "]");
    }
}
