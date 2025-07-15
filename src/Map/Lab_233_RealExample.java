package Map;

import java.util.*;

public class Lab_233_RealExample {
    public static void main(String[] args) {

        //Maps are keys and value pairs
        Map<String,Object> Student1 = new HashMap<>();
        Student1.put("name" , "Srilatha");
        Student1.put("Phoneno" , 9392533874l);
        Student1.put("address1" , 123456);
        Student1.put("address2" , 34567);

        Map<String,Object> Student2 = new HashMap<>();
        Student2.put("name" , "Srilatha");
        Student2.put("Phoneno" , 9392533874l);
        Student2.put("address1" , 123456);
        Student2.put("address2" , 34567);
        //Maps will be stored in curly braces "{}"

        //Here we are storing map data in Array list
        //List stores list of elements
        List Students = new ArrayList<>();
        Students.add(Student1);
        Students.add(Student2);
        System.out.println(Students);
        //List will be stored in  square brackets"[]"


        //set is only keys
        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");//This will be removed bcz set does not allow duplicates
        book_read_items.add("Eat the Frog");
        System.out.println(book_read_items);



    }
}
