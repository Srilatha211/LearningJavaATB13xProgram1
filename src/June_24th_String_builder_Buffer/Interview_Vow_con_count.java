package June_24th_String_builder_Buffer;

import java.util.Scanner;

public class Interview_Vow_con_count {
    public static void main(String[] args) {
        System.out.println("Enter a String : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {  // Check for alphabet only
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
