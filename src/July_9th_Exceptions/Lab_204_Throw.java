package July_9th_Exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab_204_Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!");
        int age = sc.nextInt();
        try {
            validateAge(age);//This will throw an exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    static void validateAge(int age) throws ArithmeticException {

        //here in case of methods also it throwsa an execption and even can have multiple exceptions
        ////static void validateAge(int age) throws ArithmeticException, FileNotFoundException
        if(age < 18){
            throw new ArithmeticException("You are a minor, Can't go to GOA!");
            //Explicitly thowing an error
            //In case of throw multiple exceptions are not allowed
        }else{
            System.out.println("can go to goa");
        }
    }


}
