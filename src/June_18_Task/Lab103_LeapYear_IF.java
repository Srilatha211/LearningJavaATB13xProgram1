package June_18_Task;

import java.util.Scanner;

public class Lab103_LeapYear_IF {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if ((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)) {
            System.out.println(num + "-->This is a leap year");
        } else {
            System.out.println(num + "-->This is a not leap year");
        }
    }

}