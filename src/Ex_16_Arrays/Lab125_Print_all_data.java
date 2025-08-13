package Ex_16_Arrays;

import java.util.Arrays;

public class Lab125_Print_all_data {
    public static void main(String[] args) {
        int[] marks={10,50,78,40,56};
        Arrays.sort(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
          //  System.out.println(marks); // this will print the reference not the marks list

        }
//Sort() is used to sort the arrays in ascending order

    }
}
