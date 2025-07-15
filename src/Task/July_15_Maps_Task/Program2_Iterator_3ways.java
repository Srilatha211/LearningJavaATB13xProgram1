package Task.July_15_Maps_Task;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Program2_Iterator_3ways {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Name" , "Dipak");
        map.put("Role", "Tester");
        map.put("Level", "Senior");


// Method 1: Using entrySet()
        System.out.println("Using Entry Set");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

        System.out.println("-------");
        System.out.println("Using Key Set");


// Method 2: Using keySet()
        for (String key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }

// Method 2: Iterator()-- because Map does not have a method .iterator() directly.
        /*Iterator iterator =  map.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        System.out.println("-------");
        System.out.println("Using Iterator on EntrySet");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
    }
}