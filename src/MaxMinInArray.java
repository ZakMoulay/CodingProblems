import java.util.Arrays;

public class MaxMinInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,5,44,9};
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if ( arr[i] > maxValue) maxValue = arr[i];
            if ( arr[i] < minValue) minValue = arr[i];
        }

        //Arrays.sort(arr);
        System.out.println("The min number is " + minValue);
        System.out.println("The max number is " + maxValue);
    }
}
