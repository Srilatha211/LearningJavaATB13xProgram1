package Ex_16_Arrays.Two_Dimensional_Arrays;

public class Lab135_Two_dimensional_Array_Creation {


    public static void main(String[] args) {

//Predefined array
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

//predefined array can be aslo in this form

        int[][] array1;
        array1= new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//Fixed size array
        int[] [] array2= new int[3][3];
        array2 [0][0]= 1;
        array2 [0][2]= 2;
        array2 [0][3]= 3;
        array2 [1][0]= 4;
        array2 [1][2]= 5;
        array2 [1][3]= 6;
        array2 [2][0]= 7;
        array2 [2][2]= 8;
        array2 [2][3]= 9;


    }
}
