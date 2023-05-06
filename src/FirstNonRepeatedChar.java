import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String s1 = "abcahjfA";
        String s2 = "aabbcc";
        System.out.println(FirstNonRepeatedChar(s2));
    }
    public static char FirstNonRepeatedChar(String st) {
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
}
