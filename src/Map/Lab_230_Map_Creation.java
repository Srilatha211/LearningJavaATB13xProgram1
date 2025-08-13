package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab_230_Map_Creation {
    public static void main(String[] args) {
        Map m1 = new HashMap(20);
        // Map is key and value pair


//This will not  have sorting order
        m1.put("name","srilatha");
        m1.put("rollno",1);
        m1.put("phone",987654321);
//        m1.put(34,90);
        System.out.println(m1);


//This will have insertion order

        Map m2 = new LinkedHashMap();
        m1.put("name","srilatha");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);

//This will have sorting order
        Map m3 = new TreeMap();
        m3.put("firstname","Srilatha");
        m3.put("lastname","Kore");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);




    }
}