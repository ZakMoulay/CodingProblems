import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter a positive number : ");
        int num = keys.nextInt();
        System.out.println(isPrime(num));
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
