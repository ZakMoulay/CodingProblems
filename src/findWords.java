import java.util.*;

public class findWords {
    public static void main(String[] args) {
        //   Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.
        //
        //In the American keyboard:
        //
        //the first row consists of the characters "qwertyuiop",
        //the second row consists of the characters "asdfghjkl", and
        //the third row consists of the characters "zxcvbnm".
        //Input: words = ["Hello","Alaska","Dad","Peace"]
        //Output: ["Alaska","Dad"]
        //Input: words = ["omk"]
        //Output: []
        //Input: words = ["adsdf","sfd"]
        //Output: ["adsdf","sfd"]
        String[]  words = {"Hello","Alaska","Dad","Peace"};
        String[] words1 = findWords(words);
        for (String s : words1) {
            System.out.println(s);
        }
    }
    public static String[] findWords(String[] sArr) {

        Set<Character> mySet1 = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
        Set<Character> mySet2 = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
        Set<Character> mySet3 = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));
        List<String> myList = new ArrayList<>();
        for (int i = 0; i < sArr.length; i++) {

            int temp = sArr[i].length();
            String word = sArr[i].toLowerCase();
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;

            for (int j = 0; j < word .length() ; j++) {
                if ( mySet1.contains(word .charAt(j)) ){
                    count1++;
                }else if ( mySet2.contains(word .charAt(j))){
                    count2++;
                }else if ( mySet3.contains(word .charAt(j))){
                    count3++;
                }
            }
            if ( count1 == temp || count2 == temp || count3 == temp ) {
                myList.add(sArr[i]);
            }
        }
        return myList.toArray(new String[0]);
    }

}
