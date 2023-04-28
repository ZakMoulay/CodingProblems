public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
    }
    public static boolean isPalindrome(String s1){
        return s1.equals( new StringBuilder(s1).reverse().toString());
    }
    public static boolean isThePalindrome(String s){
        int l = 0, r = s.length() - 1;
        while ( l <= r ){
            if ( s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
