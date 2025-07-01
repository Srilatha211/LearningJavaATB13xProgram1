package June_27th_2dimensional_Arrays;

import java.util.Scanner;

public class Lab142_2D_Left_triangle {
    public static void main(String[] args) {
            System.out.println("Enter the number");
            Scanner scanner = new Scanner(System.in);
            int n= scanner.nextInt();

            for(int i=n;i>=1;i--)// we need to strt from no.3 to 1 so we this condition
            {
                for(int j=1;j<=i;j++){// here j need to starts from 1 to 3
                    System.out.print("*" +" | ");
                }
                System.out.println();
            }
        }
    }

