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
    public static boolean isOmorphic(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Map<Character, Character> hMap = new HashMap<>();
        Set<Character> mySet = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (hMap.containsKey(c1)) {
                if (hMap.get(c1) != c2) {
                    return false;
                } else {
                    if (mySet.contains(c2)) {
                        return false;
                    }
                }
                hMap.put(c1, c2);
                mySet.add(c2);
            }

        }
        return true;
    }

}
