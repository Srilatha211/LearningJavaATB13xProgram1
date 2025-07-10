package Task.June_24th_Task;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        System.out.println("Enter the Marks");
        Scanner scanner= new Scanner(System.in);
        int marks=scanner.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("Grade A+");
        }
        else if(marks>=80 && marks<=89){
            System.out.println("Grade A");
        }
        else if(marks>=70 && marks<=79){
            System.out.println("Grade B");
        }
        else if(marks>=60 && marks<=69){
            System.out.println("Grade c");
        }
        else if(marks>=50 && marks<=59){
            System.out.println("Grade D");
        }
        else if(marks>=40 && marks<=49){
            System.out.println("Grade E");
        }
        else {
            System.out.println("Fail");
        }

    }


}
