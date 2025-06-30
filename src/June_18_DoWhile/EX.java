package June_18_DoWhile;

import java.util.Scanner;

public class EX {

    public static void main(String[] args) {


        int n1 = 4;
        int n2 = 3;
        int n3 = 2;

        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " is the largest number.");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " is the largest number.");
        } else {
            System.out.println(n3 + " is the largest number.");
        }

    }
}