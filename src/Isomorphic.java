import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
Two strings str1 and str2 are called isomorphic if there is a one-to-one mapping
possible for every character of str1 to every character of str2. And all occurrences
of every character in ‘str1’ map to the same character in ‘str2’.
Input:  str1 = “aab”, str2 = “xxy”
Output: True
Explanation: ‘a’ is mapped to ‘x’ and ‘b’ is mapped to ‘y’.

Input:  str1 = “aab”, str2 = “xyz”
Output: False

  */

public class Isomorphic {
    public static void main(String[] args) {
        String st1 = "aab";
        String st2 = "xxy";
        System.out.println(isOmorphic(st1,st2));
    }
    public static boolean isOmorphic(String st1, String st2) {
        if (st1.length() != st2.length()) return false;
        Map<Character, Character> hMap = new HashMap<>();
        for (int i = 0; i < st1.length(); i++) {
            char c = st1.charAt(i);
            char p = st2.charAt(i);
            if (hMap.containsKey(c)) {
                if (hMap.get(c) != p) {
                    return false;
                }
            } else {
                hMap.put(c, p);
            }
        }
        return true;
    }

}
