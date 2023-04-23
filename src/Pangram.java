public class Pangram {
    public static void main(String[] args) {
        System.out.println(isPangram("i love sushi"));
    }
    // assuming all letters are lower case
    public static boolean isPangram(String st){
        if ( st.isEmpty() ) return false;
        String s = st.replace(" ","");
        int[] arr = new int[26];
        for(char c : s.toCharArray() ) {
            arr[c - 'a']++;
        }
        for(int p : arr){
            if ( p == 0 )
                return false;
        }
        return true;
    }
}
