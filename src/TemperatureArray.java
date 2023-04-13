public class TemperatureArray {
    public static void main(String[] args) {
        int[] array = {86,77,66,90,36,44,87};
        int minTemp = array[0];
        int maxTemp = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( array[i] > maxTemp )
                maxTemp = array[i];
            if ( array[i] < minTemp )
                minTemp = array[i];
        }
        System.out.println("The highest temperature is : " + maxTemp);
        System.out.println("The lowest temperature is : " + minTemp);
    }
}
