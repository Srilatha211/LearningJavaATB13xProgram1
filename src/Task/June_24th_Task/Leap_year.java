package Task.June_24th_Task;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner scanner= new Scanner(System.in);
        int year=scanner.nextInt();
        if((year%4==0 && year%100 !=0) ||(year%400==0)){
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }
    }
}
