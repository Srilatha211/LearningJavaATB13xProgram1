package June_25th_Arrays;

import java.util.Scanner;

public class Number_Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();

        if(num<0)
        {
            System.out.println("Negative numbers are not considered as Palindrome");
        }
        else{
        int original=num;
        int reverse=0;

        while(num!=0)
        {
            int digit = num%10;
            reverse = reverse *10+digit;
            num=num/10;
        }
        if(original==reverse){
            System.out.println("This is a Palindrome");
        }else{
            System.out.println("This is a not Palindrome");

        }

        }
    }
}
