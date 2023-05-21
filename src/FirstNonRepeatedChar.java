import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String s1 = "abcahjfA";
        String s2 = "aabbcc";
        System.out.println(FirstNonRepeatedChar(s2));
    }
    public static char FirstNonRepeatedChar(String st) {   // O(n)
        Map<Character, Integer> lkdHmap = new LinkedHashMap<>();
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            lkdHmap.put(c, lkdHmap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if (lkdHmap.get(c) == 1) {
                return c;
            }
        }
        return '\0';
    }
    public static char theNonFirstNonRepeatedChar(String st) { // O(n^2)
        int n = st.length();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (st.charAt(i) == st.charAt(j)) count++;
            }
            if (count == 0) return st.charAt(i);
        }
        return '\0';
    }

}
