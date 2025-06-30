package June_24th_Task;

import java.util.Scanner;

public class Largest_of_two_numbers {
    public static void main(String[] args) {
        System.out.println("Enter the First number");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter the Second number");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Largest number is :" + num1);
        } else if (num2 > num1) {
            System.out.println("Largest number is :" + num2);
        } else {
            System.out.println("Both are equal");
        }
    }
}