package Ex_16_Arrays.Two_Dimensional_Arrays;

public class Lab139_Print_Star {
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3},{3,4,5},{4,7,9}};
        System.out.println(matrix.length);
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print("*" + " | ");

            }
            System.out.println();
        }
    }
}
