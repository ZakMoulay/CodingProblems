public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("alo", "ola"));
        System.out.println(anagram("alo", "ola"));
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }
        for (int p : arr) {
            if (p != 0)
                return false;
        }
        return true;
    }

    public static boolean anagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (!s2.contains(String.valueOf(c)))
                return false;
        }
        return true;
    }
}
