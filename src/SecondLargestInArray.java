import java.util.Arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {11,33,22,55,99,88,56,45};
        Arrays.sort(arr);
        System.out.println("the second largest number is : " + arr[arr.length-2]);
    }
}
