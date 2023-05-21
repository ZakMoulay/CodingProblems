public class CoountNumOfWords {
    public static void main(String[] args) {
        String s = "I love sushi";
        System.out.println(countNumOfWords(s));
    }

    public static int countNumOfWords(String s) {
        String st = s.trim();
        if (st.length() == 0 || st.isEmpty()) return 0;
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == ' ') count++;
        }
        return count + 1;
    }

}
