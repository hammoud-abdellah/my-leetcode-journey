import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        
        for (int num : nums) {
            if (numsMap.containsKey(num)){
                return true;
            } 
            numsMap.put(num, 0);
        }
        return false;
    }
}

