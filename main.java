public class main {
    public static void main(String[] args) {

        ValidAnagram solution = new ValidAnagram();

        // Test cases
        String s1 = "anagram";
        String t1 = "nagaram";

        // System.out.println(solution.sortString(t1));

        String s2 = "rat";
        String t2 = "car";

        String s5 = "abcd";
        String t5 = "dcbae"; // False, different lengths

        // Print results
        System.out.println("Test 1: " + solution.isAnagram(s1, t1)); // Expected: true
        System.out.println("Test 2: " + solution.isAnagram(s2, t2)); // Expected: false
        System.out.println("Test 5: " + solution.isAnagram(s5, t5)); // Expected: false
    
    }
}
