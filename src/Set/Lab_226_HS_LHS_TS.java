package Set;

import java.util.*;

public class Lab_226_HS_LHS_TS {
    public static void main(String[] args) {

        Set<String> hs = new HashSet();
        // Hashing mechanism to store the element
        // no order maintained
        // no duplicates
        // Stores the elments in hashcode
        // e1 -> hashcode (xyz), e2 -> hashcode -> abc
        //One null is allowed


        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        // hs.add(123);//This is not allowed bcz it is not generic case
        hs.add(null);
//        hs.add(null);

        System.out.println(hs);
//for each loop-- advanced forloop
        System.out.println(" ----- For Each ---- ");
        for (String s : hs){
            System.out.println(s);
        }
        System.out.println(" ---------------------------");

        // Iterator
        System.out.println(" ----- Iterator ---- ");
        Iterator iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(" ---------------------------");


        Set lhs = new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates
        //One null is allowed

        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println(" ---------------------------");

        //for each loop
        System.out.println(" ----- For Each ---- ");
        for(Object o : lhs){
            System.out.println(o);
        }
        System.out.println(" ---------------------------");

        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        // Natural Sorting - ASCII values.

        ts.add("Dapple");
        ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        //ts.add(123);//Here sorting is based on datatype
        // ts.add(null);//This is not allowed bcz sorting is based on datatype

        System.out.println(ts);

        System.out.println(" ----- For Each ---- ");

        for(Object o:ts){
            System.out.println(o);
        }


    }
}