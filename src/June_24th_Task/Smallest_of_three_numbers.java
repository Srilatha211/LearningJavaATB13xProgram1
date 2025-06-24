package June_24th_Task;

import java.util.Scanner;

public class Smallest_of_three_numbers {
    public static void main(String[] args) {
        System.out.println("Enter the number1");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter the number2");
        int num2 = scanner.nextInt();
        System.out.println("Enter the number3");
        int num3 = scanner.nextInt();
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("Number1 is smallest :" + num1);
        } else if (num2 <= num3 && num2 <= num1) {
            System.out.println("Number2 is smallest :" + num2);
        } else {
            System.out.println("Number3 is smallest :" + num3);
        }
    }
}