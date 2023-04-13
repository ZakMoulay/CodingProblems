import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter a positive number : ");
        int num = keys.nextInt();
        fibonacci(num);
    }
    public static void fibonacci(int n){
        int firstNum = 0, secondNum = 1, thirdNum;
        System.out.print(firstNum + " " + secondNum );
        for (int i = 2; i < n; i++){
            thirdNum = firstNum + secondNum;
            System.out.print(" " + thirdNum);
            firstNum = secondNum;
            secondNum = thirdNum;
        }
    }
}
