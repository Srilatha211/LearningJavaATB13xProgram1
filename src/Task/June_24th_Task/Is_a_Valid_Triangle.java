package Task.June_24th_Task;

import java.util.Scanner;

public class Is_a_Valid_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter the side1");
        Scanner scanner= new Scanner(System.in);
        int s1 = scanner.nextInt();
        System.out.println("Enter the side2");
        int s2 = scanner.nextInt();
        System.out.println("Enter the side3");
        int s3 = scanner.nextInt();
        if(s1+s2>s3 && s2+s3>s1 && s3+s1>s2){
            System.out.print("This is a valid triangle");

            if(s1==s2 && s2==s3 && s3==s1){
                System.out.println(" : This is an Equilateral triangle");
            }else if(s1==s2 || s2==s3 ||s3==s1 ){
                System.out.println(" : Isosceles Triangle");
            }else{
                System.out.println(" : Scalen Triangle");
            }
        }else{
            System.out.println(" Not a valid Triangle");
        }


    }


}
