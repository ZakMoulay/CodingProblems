import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("the sum of all the values in the array is " + sum);
        int theSum = Arrays.stream(arr).reduce(0,(a, b) -> a + b);
        System.out.println(theSum);
    }
}
