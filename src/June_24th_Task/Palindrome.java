package June_24th_Task;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a String : ");
        Scanner scanner= new Scanner(System.in);
        String Input=scanner.nextLine();
        String original= Input.toLowerCase();

        String reverse = "";
        for(int i=original.length()-1; i>=0; i--)
        {
            reverse = reverse+original.charAt(i);

        }
        if(original.equals(reverse)){

            System.out.println("This is a Palindrome");

        }else{
            System.out.println("This is not a Palindrome");

        }

    }
};
