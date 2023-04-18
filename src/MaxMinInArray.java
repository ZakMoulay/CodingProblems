import java.util.Arrays;

public class MaxMinInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,9};
//        int maxValue = arr[0];
//        int minValue = arr[0];
//        for (int i = 0; i < arr.length ; i++) {
//            if ( arr[i] > maxValue) maxValue = arr[i];
//            if ( arr[i] < minValue) minValue = arr[i];
//
        Arrays.sort(arr);
        System.out.println("The min number is " + arr[0]);
        System.out.println("The max number is " + arr[arr.length-1]);
    }
}
