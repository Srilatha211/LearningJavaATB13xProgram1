package June_23_Task;

import java.util.Scanner;

public class Positive_numbers {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("num" + ":Postive number");
        } else if (num < 0) {
            System.out.println("num" + ":Negative number");
        } else {
            System.out.println("num" + ":Zero number");
        }
    }
}

