public class MaxMinInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,9};
        int maxValue = arr[0];
        int minValue = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if ( arr[i] > maxValue) maxValue = arr[i];
            if ( arr[i] < minValue) minValue = arr[i];
        }
        System.out.println("The max Value is : " + maxValue);
        System.out.println("The minValue is : " + minValue);
    }
}
