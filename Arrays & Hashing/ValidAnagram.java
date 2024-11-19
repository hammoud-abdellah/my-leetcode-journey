import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        String t1 = sortString(t);
        String s1 = sortString(s);
        return s1.equals(t1);
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
