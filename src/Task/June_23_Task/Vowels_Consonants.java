package Task.June_23_Task;

import java.util.Scanner;

public class Vowels_Consonants {
    public static void main(String[] args) {
        System.out.println("Enter the character");
        Scanner sc= new Scanner(System.in);
        char ch = sc.next().charAt(0);// without lowecase
//char ch = sc.next().toLowerCase().charAt(0);// with lowecase
        if(ch>='a'&& ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.println( ch + " Is a vowel");
            }
            else  {
                System.out.println(ch + " Is  a consonant");
            }
        }
        else {
            System.out.println("Invalid -- Not a charecter");
        }
    }
}
