package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab_304_compare_ArrayList_Linklist {
    public static void main(String[] args) {

        //one way of creating array/Linkedlist by giving capacity
        List mylist = new ArrayList(5);
        //other way of creating array/Linkedlist is default
        List mylist0 = new ArrayList(); // // Arrays Format - Continuous memory

        List mylist2 = new LinkedList(); // Doubly Linked List./ scarted

        mylist2.add("sri");
        mylist2.add("latha");
        mylist2.add("kore");
        mylist2.add("yash");
        mylist2.add("Harsh");
        mylist2.add("Harsh");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add(123);
        System.out.println(mylist2);

        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("sri"));
        System.out.println(mylist2.indexOf("sri"));//Both arraylist and linked lst cast have duplicates
        System.out.println(mylist2.get(0));

        System.out.println(" --- ");
//Linked list also supports  iterator
        //Iterator is same as forloop but does not care abt the dtattypes

        Iterator iterator =  mylist2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
