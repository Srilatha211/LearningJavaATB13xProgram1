package June_27th_2dimensional_Arrays;

public class Lab138_Array_Iterate_Loop {

    // also this knows iterate the loop or print all the elements in the matrix
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3},{3,4,5},{4,7,9}};

        //matrix is always where rows and colounms are equal
        //jagged array-- where rows and colounms are not equal

        //3*3 -- matrix
        //R-3
        //C-3
        System.out.println(matrix.length);
        for (int i = 0; i < matrix.length; i++) {// 0,1,2
            for (int j = 0; j < matrix[i].length ; j++) {// 0,1,2
                System.out.print(matrix[i][j] +" | ");

            }
            System.out.println();
        }

    }
}
