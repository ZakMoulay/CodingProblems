import java.util.Arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {11, 33, 22, 55, 99, 88, 56, 45};
        System.out.println(secondLargest(arr));
        Arrays.sort(arr);
        System.out.println("the second largest number is : " + arr[arr.length-2]);
        System.out.println(theSecondLargest(arr));

    }

    public static int theSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;

    }


    public static int secondLargest(int[] arr) {
        int firstLargest = 0;
        int secondLargest = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr[arr.length - 2];

    }
}
