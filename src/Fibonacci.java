import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter a positive number : ");
        int num = keys.nextInt();


        System.out.println(fibonacci(num));

    }

    public static int fibonacci(int n) {
        if (n < 2) return 1;
        int i = 2;
        int a = 0;
        int b = 1;
        int fib = 0;
        while (i<= n) {
            fib = b + a;
            a = b;
            b = fib;
            i++;
        }
        return fib;
    }

}








