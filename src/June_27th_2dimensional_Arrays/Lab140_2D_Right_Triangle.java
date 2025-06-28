package June_27th_2dimensional_Arrays;

import java.util.Scanner;

public class Lab140_2D_Right_Triangle {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner= new Scanner(System.in);
        int matrix= scanner.nextInt();

        for (int i = 0; i < matrix; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
