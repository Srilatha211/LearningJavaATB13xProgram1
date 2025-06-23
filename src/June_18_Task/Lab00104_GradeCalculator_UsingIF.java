package June_18_Task;

import java.util.Scanner;

public class Lab00104_GradeCalculator_UsingIF {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        if((num >=90 && num<=100))
        {
            System.out.println("A Grade");
        }
        else if(num >=80 && num<=89)
        {
            System.out.println("B Grade");
        }
        else if(num >=70 && num<=79)
        {
            System.out.println("c Grade");
        }
        else if(num >=60 && num<=69)
        {
            System.out.println("D Grade");
        }
        else if(num >=0 && num<=59)
        {
            System.out.println("E Grade");
        }
        else
        {
            System.out.println("Fail");
        }

    }
}
