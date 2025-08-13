package Ex_32_Collection_FrameWorks_DSA.List;

import java.util.LinkedList;

public class Lab_213_LinkedList {
    public static void main(String[] args) {
        //LinkedList  animals = new LinkedList(); // Accepts all the datatypes
        LinkedList<String> animals = new LinkedList();
        //Here this is hardcoded will not accept any other data type
        // animals.add(123)//interger is not allowed as it is hardcoded
        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Elephant");
        animals.addLast("Elephant");
        System.out.println("LinkedList: " + animals);

        // Accessing elements
        System.out.println("First element: " + animals.getFirst());
        System.out.println("Last element: " + animals.getLast());

        // Removing elements
        animals.removeFirst();
        animals.removeLast();
        System.out.println("LinkedList after removal: " + animals);

        System.out.println("Size of LinkedList: " + animals.size());


    }
}

