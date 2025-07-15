package Task.July_11th_List;

import java.util.LinkedList;
import java.util.List;

//Description:
//Create a LinkedList with fruits: Apple, Banana, Mango.
//Insert Orange at index 1 and print the final list.
public class Task_6 {
    public static void main(String[] args) {
        // Create a LinkedList of fruits
        LinkedList<String> fruits = new LinkedList<>();

        // Add initial fruits
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Insert "Orange" at index 1
        fruits.add(1, "Orange");
        // Insert "Orange" at index 4

        fruits.add(4,"Papaya");

        // Print the final list
        System.out.println("Final Fruit Ex_32_Collection_FrameWorks_DSA.List: " + fruits);
    }



    }
