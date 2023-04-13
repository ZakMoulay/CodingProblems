public class SwapTwoNum {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println(" Before swap : ");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(" After swap : ");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);

    }
}
