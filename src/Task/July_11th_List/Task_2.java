package Task.July_11th_List;
//Remove an element from arraylist

import java.util.ArrayList;
import java.util.List;

// Description:
//Create an ArrayList with these names: Amit, Neha, Suresh.
//Remove the name Neha and display the updated list.
public class Task_2 {
    public static void main(String[] args) {
        List l= new ArrayList();
        l.add("Amit");//0
        l.add("Neha");//1
        l.add("Suresh");//2

        l.remove(1);
        System.out.println(l);

    }
}
