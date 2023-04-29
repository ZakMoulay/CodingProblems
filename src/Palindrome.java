public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
    }

    public static boolean isPalindrome(String s1) {
        return s1.equals(new StringBuilder(s1).reverse().toString());
    }

    public static boolean isThePalindrome(String st) {
        String s = st.toLowerCase();
        int l = 0, r = s.length() - 1;
        boolean isPalindrome = true;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                isPalindrome = false;
                break;
            }
            l++;
            r--;
        }
        return isPalindrome;
    }
}
