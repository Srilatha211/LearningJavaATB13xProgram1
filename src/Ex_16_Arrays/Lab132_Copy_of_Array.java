package Ex_16_Arrays;

public class Lab132_Copy_of_Array {
    public static void main(String[] args) {
        // Original array
        int[] original = {10, 20, 30, 40, 50};

        // Create copy array with same length
        int[] copy = new int[original.length];

        // Copy elements from original to copy
        System.arraycopy(original, 0, copy, 0, original.length);
//print the original array
        System.out.println("Print the original array");
        for (int i = 0; i < original.length ; i++) {
            System.out.println(original[i]);

        }

        //print the original array
        System.out.println("Print the copy of  array");

        for (int i = 0; i < copy.length ; i++) {
            System.out.println(copy[i]);

        }
    }
}
