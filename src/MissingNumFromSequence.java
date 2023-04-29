public class MissingNumFromSequence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        int sumExpected = (n * (arr[0] + arr[arr.length - 1])) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sumExpected - sum;
    }
}
