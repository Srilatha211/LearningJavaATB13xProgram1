package Ex_32_Collection_FrameWorks_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab302_ArrayList_Capacity {
    public static void main(String[] args) {
       // Ex_32_Collection_FrameWorks_DSA.List l = new ArrayList();// Default capacity // Dynamic dispatch
        List list= new ArrayList(10);
        list.add("1"); // 0
        list.add("2");  // 1
        list.add("3"); // 2
        list.add("3");  //3
        list.add(4);  //4
        list.add(true);  //5
        list.add("3"); // 6

        System.out.println(list.size()); //7 - all the elements

        System.out.println(list.isEmpty()); // thier is no empty -- false
        System.out.println(list.contains("1")); // Ex_32_Collection_FrameWorks_DSA.List conatins string element 1
        System.out.println(list.contains(1)); //Ex_32_Collection_FrameWorks_DSA.List does not contains interger element 1

        // Returns the index of the first occurrence of the specified element in this list,
        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));

        System.out.println(list);
        System.out.println(" -----------");

        //we aslo print the elements by using for loop
        for(int i=0; i<list.size() ; i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println(" -----------");


list.set(2,30);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);

        for (Object o: list){
            System.out.println(o);
        }


        list.clear();
        System.out.println(list);
    }

}
