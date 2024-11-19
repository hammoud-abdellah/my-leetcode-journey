import java.util.Map;

public class main {
    public static void main(String[] args) {

        // TopKFrequentElements solution = new TopKFrequentElements();

        // Test cases
        int[] nums = {1,1,1,1,2,2,3};
        int k = 2;
        
        Map<Character, Character> pairs = Map.of(')', '(', '}', '{', ']', '[');
        // Print results (indexes of the two numbers that add up to the target)
        System.out.println(pairs);
    }
}
