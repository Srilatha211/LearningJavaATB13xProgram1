package June_16_Switch_Case;

import java.util.Scanner;

public class Lab0060_Switch_withoutDefault {
    public static void main(String[] args) {

        //O/P--> It will not print any bcz their is no case matching condition

        // We can have a switch case with no default with less no of cases
        // which is allowed
        System.out.println("Enter the weekday 1-7");

        Scanner scanner= new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day){

            case 1:
            System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday");
                break;

        }
    }
}
