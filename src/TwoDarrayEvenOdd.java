import javax.imageio.metadata.IIOMetadataFormatImpl;

public class TwoDarrayEvenOdd {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}

        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0)
                    System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();

    }
}
