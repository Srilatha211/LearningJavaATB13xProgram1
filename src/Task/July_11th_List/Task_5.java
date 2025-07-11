package Task.July_11th_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//Description (Updated with Hints):
//In this program, you’ll compare how fast Java can add elements to an ArrayList versus a LinkedList.

//You will:

//Create two separate lists: one ArrayList and one LinkedList.

//Add 100,000 numbers (from 0 to 99,999) to each list using a loop.

//Use System.currentTimeMillis() to measure how much time it takes to add the elements.

//Print the time taken for both lists.

// Hint :-

// :-  System.currentTimeMillis() gives you the current time in milliseconds.

// :-  Subtract the end time from the start time to get the duration.

// :-  You don’t need to print all the 100,000 numbers, just print the time taken.



public class Task_5 {
    public static void main(String[] args) {

        // Creating ArrayList and LinkedList
        List  arrayList = new ArrayList();
        List  linkedList = new LinkedList();

        // Measuring time for ArrayList
        long startArrayList = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endArrayList = System.currentTimeMillis();

        long durationArrayList = endArrayList - startArrayList;

        // Measuring time for LinkedList
        long startLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        long endLinkedList = System.currentTimeMillis();
        long durationLinkedList = endLinkedList - startLinkedList;


        System.out.println("Time taken by ArrayList: " + durationArrayList + " ms");
        System.out.println("Time taken by LinkedList: " + durationLinkedList + " ms");
    }
}

