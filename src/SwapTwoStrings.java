public class SwapTwoStrings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World!";
        System.out.println("Before swap :");
        System.out.println(" s1 = " + s1);
        System.out.println(" s2 = " + s2);
        swapTwoStrings(s1, s2);
    }
    public static void swapTwoStrings(String st1, String st2) {
        st1 = st1.concat(st2);
        st2 = st1.substring(0, st1.length() - st2.length());
        st1 = st1.substring(st2.length());
        System.out.println("After swap :");
        System.out.println(" s1 = " + st1);
        System.out.println(" s2 = " + st2);
    }
}
