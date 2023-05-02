import java.util.HashSet;
import java.util.Set;

public class FindAllDistinctPalindrome {
    public static void main(String[] args) {
        String st1 = "abaaa";
        String st2 = "geek";

        printAllDistinctPalindrome(st1);
        printAllDistinctPalindrome(st2);

    }
    // brute force O(n^2)
    public static void printAllDistinctPalindrome(String s){
        Set<String> mySet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                if ( isPalindrom(s.substring(i,j))){
                    mySet.add(s.substring(i,j));
                }
            }

        }
        System.out.println(mySet);
    }
    public static boolean isPalindrom(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }

}
