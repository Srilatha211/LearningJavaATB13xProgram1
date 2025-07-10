package Ex_7_If_condition;

import java.util.Scanner;

public class Lab0058_If_condition_1 {

    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner scanner= new Scanner(System.in);
       // int age = scanner.nextInt();
        double age = scanner.nextDouble();

        if(age > 18){

            System.out.println("Allow to vote");
        }
    }
}
