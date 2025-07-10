package Ex_16_Arrays.Two_Dimensional_Arrays;

public class Lab143_Transpose_MAtrix {
    public static void main(String[] args) {
        int[][] original= {
                {2,3,4},
                {1,4,5}
        };

        int rows = original.length;
        int cols = original[0].length;

        int[][] transpose = new int[cols][rows];

        // Transpose logic
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = original[i][j];
            }
        }

        // Print transpose
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}