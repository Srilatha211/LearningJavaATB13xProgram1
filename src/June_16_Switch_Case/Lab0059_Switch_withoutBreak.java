package June_16_Switch_Case;

import java.util.Scanner;

public class Lab0059_Switch_withoutBreak {
    public static void main(String[] args) {

        // Take use input and tell them the day which they have told
        // 1 t0 7  1-->monday .. 7-->sun
        //8-->This is not a weekday--Not allowed

        // without break it will executes all the statements

        System.out.println("enter the week day 1 - 7");
        Scanner scanner= new Scanner(System.in);
        int day= scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                //break;
            case 2:
                System.out.println("Tuesday");
                //break;
            case 3:
                System.out.println("Wednesday");
                //break;
            case 4:
                System.out.println("Thursday");
                //break;
            case 5:
                System.out.println("Friday");
                //break;

            case 6:
                System.out.println("Saturday");
                //break;
            case 7:
                System.out.println("Sunday");
                //break;
            default :
                System.out.println("This is not a weekday--Not allowed");
                //break;


        }

    }
}
