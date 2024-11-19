import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        //Frequency Map Creation
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();

        for (int i=0; i < nums.length; i++) {
            if (numsMap.containsKey(nums[i])){
                numsMap.put(nums[i], numsMap.get(nums[i]) + 1);             
            } else {
                numsMap.put(nums[i], 1);
            }
        }
        System.out.println("numsMap : " + numsMap);

        //Sorting by value
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(numsMap.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        List<Integer> keys = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            keys.add(entry.getKey());
        }

        System.out.println("keys : " + keys);
        int[] output = new int[k];

        for(int i= 0; i < k; i++){
            output[i] = keys.get(i);
        }

        return output;
        
    }
}
