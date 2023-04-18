import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter a positive number : ");
        int num = keys.nextInt();
        //System.out.println(isPrime(num));
        if (num == 1)
            System.out.println(num + " is a prime number ");
        for (int i = 2; i < num/2; i++) {
            if ( num % i == 0)
                System.out.println(num + " is not  a prime number");
        }
        System.out.println(num + " is a Prime number");
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
