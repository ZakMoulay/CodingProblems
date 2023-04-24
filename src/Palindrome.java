public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
    }
    public static boolean isPalindrome(String s1){
        return s1.equals( new StringBuilder(s1).reverse().toString());
    }
}
