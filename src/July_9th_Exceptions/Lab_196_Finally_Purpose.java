package July_9th_Exceptions;

import java.util.Scanner;

public class Lab_196_Finally_Purpose {
    public static void main(String[] args) {

        System.out.println("Enter the x : ");
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();

        try {
            int b=10/x; // throws an arthimetic exception
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception is Caught");

        } finally {
            sc.close();
            System.out.println("Finally : This will always executed ");
            //this will always executed
            // even try and caught executes or not bcz
            //if we get error it will not close the
            //so, for that we use finnaly to exit
        }

    }
}
