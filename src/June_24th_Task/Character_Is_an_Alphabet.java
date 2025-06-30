package June_24th_Task;

import java.util.Scanner;

public class Character_Is_an_Alphabet {
    public static void main(String[] args) {
        System.out.println("Enter any character");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + ": This is an Alphabet");
        } else {
            System.out.println("Invalid Input : Please enter a Charecter");
        }


    }
    }
