package Ex_16_Arrays;

import java.util.Scanner;

public class Lab128_Arrays_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask user for size of array
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        // Step 2: Create array of given size
        int[] numbers = new int[size];

        // Step 3: Input elements into array
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Step 4: Print elements in array
        System.out.println("Elements in the array:");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }




    }
}
