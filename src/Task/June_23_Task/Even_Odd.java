package Task.June_23_Task;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();
        if(num%2==0)
        {
            System.out.println("num" + ":Even number");
        } else{
            System.out.println("num" + ":ODD number");
        }
}}
