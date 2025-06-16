package June_13_UserInputsandID;

import java.util.Scanner;
import java.util.SortedMap;

public class Lab0054_ScannerClass {
    public static void main(String[] args) {

        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        String s= scanner.next();

        System.out.println("Enter the percentage");

        float percentage = scanner.nextFloat();
/*int percentage= scanner.nextInt();
       int per = a >= 40? 1: 0;*/
        String per= percentage >=40? "Pass":"Fail";
        System.out.println(per);


    }


}
