package Task.July_11th_List;

import java.util.*;

//Description:
//Create a LinkedList and add the following numbers:
//10, 20, 30, 40.
//Reverse the list and print the output.
public class Task_3 {
    public static void main(String[] args) {
        List l= new LinkedList();
        l.add(10);//0
        l.add(20);//1
        l.add(30);//2

        //to reverse a LinkedList using l.reversed();,
        // but that line will cause a compile-time error,
        // because the Ex_32_Collection_FrameWorks_DSA.List interface (and classes like LinkedList)
        // do not have a method called reversed().
       // l.reversed()
        Collections.reverse(l);
        System.out.println(l); // Output: [30, 20, 10]
    }
}
