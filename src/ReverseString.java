public class ReverseString {
    public static void main(String[] args) {
        String st = "Hello";
        System.out.println(reverseStringRecursion(st));
        System.out.println(reverseIterative(st));
        System.out.println(reverseOneLine(st));
    }
    public static String reverseOneLine(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String reverseStringRecursion(String s) {

        if (s.length() < 2) {
            return s;
        } else {
            return reverseStringRecursion(s.substring(1)) + s.charAt(0);
        }
    }

    public static String reverseIterative(String s) {
        if (s.length() == 0 || s.isEmpty()) return "";
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
