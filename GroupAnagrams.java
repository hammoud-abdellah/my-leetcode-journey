import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> strMap = new HashMap<String, List<String>>();
        // List<List<String>> grpAnagrams = new ArrayList<List<String>>();
        
        for(String str : strs){
            String sortedStr = sortString(str);
            if (strMap.containsKey(sortedStr)){
                List<String> valueArray = strMap.get(sortedStr);
                valueArray.add(str);
            } else {
                List<String> valueArray = new ArrayList<>();
                valueArray.add(str);
                strMap.put(sortedStr, valueArray);
            }
        }

        // grpAnagrams.addAll(strMap.values());

        // return grpAnagrams;

        return new ArrayList<>(strMap.values());

        
    }

    public String sortString(String str) {
        //transform the string to the charts array
        char[] chars = str.toCharArray();
        //sort the array
        Arrays.sort(chars);
        //transform the charts array to the string 
        String sortedStr = new String(chars);

        return sortedStr;
    }
}
