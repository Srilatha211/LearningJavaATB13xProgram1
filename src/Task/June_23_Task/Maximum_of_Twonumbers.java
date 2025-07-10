package Task.June_23_Task;

import java.util.Scanner;

public class Maximum_of_Twonumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number1");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter the number2");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Maximum number is : " + "num 1");
        } else if (num2 > num1) {
            System.out.println("Maximum number  is : " + "num 2");
        } else {
            System.out.println("Both are equal");
        }
    }
}
