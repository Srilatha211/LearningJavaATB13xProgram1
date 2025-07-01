package June_27th_2dimensional_Arrays;

import java.util.Scanner;

public class Lab141_Multiplication {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int matrix= scanner.nextInt();

        for(int i=0;i<matrix;i++)
        {
            for(int j=0;j<matrix;j++){
                System.out.print(i*j + " | ");
            }
            System.out.println();
        }
    }

    }

