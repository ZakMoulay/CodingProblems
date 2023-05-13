import java.util.zip.ZipFile;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"abcd","ab","amznxbcvhf"};
        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String[] arr){
        if ( arr.length == 0 ) return "";
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            while( arr[i].indexOf(prefix) != 0 ){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
    return prefix;
    }
}


