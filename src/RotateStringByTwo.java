public class RotateStringByTwo {

    public static void main(String[] args) {
        // rotate string by 2 places clockwise
        // s1 = "abcde"  s2 = "cdeab"
        System.out.println(rotateByTwo("amazon"));
        System.out.println(rotateByNTimes("amazon", 2));
    }
    public static String rotateByTwo(String st){
        if ( st.isEmpty()) return "";
        char[] arr = st.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < st.length() ; i++) {
            sb.append(arr[i]);
        }
        sb.append(st.charAt(0));
        sb.append(st.charAt(1));
        return sb.toString();
    }
    public static String rotateByNTimes(String st,int n){
        if ( st.isEmpty()) return "";
        char[] arr = st.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = n; i < st.length() ; i++) {
            sb.append(arr[i]);
        }
        for (int i = 0; i < n ; i++) {
            sb.append(st.charAt(i));
        }
        return sb.toString();
    }





}
