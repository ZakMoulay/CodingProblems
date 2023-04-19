import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter a positive number : ");
        int num = keys.nextInt();
        //System.out.println(isPrime(num));
        if (num == 1)
            System.out.println(num + " is a not prime number ");
        boolean isPrime = false;
        for (int i = 2; i < num; i++) {
            if ( num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if ( !isPrime )
            System.out.println(num + " is prime ");
        else
            System.out.println(num + " is not prime ");

    }












    public static boolean isPrime(int n){
        if ( n == 1) return true;
        for (int i = 2; i < Math.sqrt(n) ; i++) {
            if ( n % i == 0)
                return false;
        }
        return true;
    }
}
