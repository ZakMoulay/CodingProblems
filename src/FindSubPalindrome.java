public class FindSubPalindrome {
    public static void main(String[] args) {
        // abc => b   axbxd => xbx  "" => ""
        String st = "afbfc";
        System.out.println(findPalindrome(st));
    }
    public static String findPalindrome(String s){
        if ( s.isEmpty() ) return "";
        String ansSt;
        int n = s.length();
        int l, r;
        if ( n % 2 == 0 ) {
            l =  n/2;
            r = n/2 + 1;
            while ( l >= 0 && r <= n-1 ){
                if ( s.charAt(l) != s.charAt(r) ){
                    ansSt = s.substring((l+1),(r+1));
                    return ansSt;
                }else {
                    l--;
                    r++;
                }
            }
        } else {
            l = n/2 - 1;
            r = (n/2) + 1;
            while ( l >= 0 && r <= n-1 ){
                if ( s.charAt(l) != s.charAt(r) ){
                    ansSt = s.substring((l+1),(r));
                    return ansSt;
                }else {
                    l--;
                    r++;
                }
            }

        }
        return "";
    }

}
