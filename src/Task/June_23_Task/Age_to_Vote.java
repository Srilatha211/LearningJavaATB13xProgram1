package Task.June_23_Task;
import java.util.Scanner;
public class Age_to_Vote {
    public static void main(String[] args) {
        System.out.println("Enter the Age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();


        if (age == 18 && age > 18) {
            System.out.println("Major - Eligible for vote");
        } else {
            System.out.println("Minor - Not eligible for vote");
        }

    }
}
